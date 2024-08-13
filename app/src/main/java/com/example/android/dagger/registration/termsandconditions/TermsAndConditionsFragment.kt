/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.dagger.registration.termsandconditions

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.android.dagger.MyApplication
import com.example.android.dagger.R
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.RegistrationViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
@AndroidEntryPoint
class TermsAndConditionsFragment : Fragment() {
    @Inject
    lateinit var registrationViewModel: RegistrationViewModel
//    private lateinit var registrationViewModel: RegistrationViewModel

//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//    //能保證鎖定在activity 因為他是activity提供的（在那ｉｎｉｔ)
//        (activity as RegistrationActivity).registrationComponent.inject(this)
//    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_terms_and_conditions, container, false)

//        registrationViewModel = (activity as RegistrationActivity).registrationViewModel

        view.findViewById<Button>(R.id.next).setOnClickListener {
            registrationViewModel.acceptTCs()
            //crash 如果不用Subcompomnet 因為完成後viewmodel不同 非同一個sample
            //所以要singelon =>我們不希望的 RegistrationViewModel 實例在流程完成後一直位於記憶體中。
            //我們希望 RegistrationViewModel 為不同的註冊流程提供不同的實例。如果用戶註冊並註銷，我們不希望顯示上次註冊的數據。
            (activity as RegistrationActivity).onTermsAndConditionsAccepted()
        }

        return view
    }
}

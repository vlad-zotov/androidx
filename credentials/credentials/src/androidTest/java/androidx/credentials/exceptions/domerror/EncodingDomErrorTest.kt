/*
 * Copyright 2022 The Android Open Source Project
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

package androidx.credentials.exceptions.domerror

import androidx.credentials.exceptions.domerrors.EncodingError
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class EncodingDomErrorTest {
    @Test
    fun construct_success() {
        EncodingError()
    }

    @Test
    fun getter_success() {
        val error = EncodingError()
        val expectedType =
            EncodingError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_ENCODING_ERROR
        assertThat(error.type).isEqualTo(expectedType)
    }
}
/*
 * Copyright (C)2018 - Deny Prasetyo <jasoet87@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package id.urara.domain

import org.amshove.kluent.`should be equal to`
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

object TalkGroupSpec : Spek({
    describe("TalkGroup") {
        describe("if have same members") {
            val tg1 = TalkGroup("田中", "佐藤", "鈴木")
            val tg2 = TalkGroup("田中", "佐藤", "鈴木")

            it("method equals() should return true") {
                assertEquals(tg1, tg2)
            }
        }
        describe("if have different members") {
            val tg1 = TalkGroup("田中", "佐藤", "鈴木")
            val tg2 = TalkGroup("田中", "佐藤", "渡辺")

            it("method equals() should return false") {
                assertFalse(tg1.equals(tg2))
                assertNotEquals(tg1, tg2)
            }
        }
    }
})

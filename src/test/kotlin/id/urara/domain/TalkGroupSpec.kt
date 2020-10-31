package id.urara.domain

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import java.util.*
import kotlin.test.assertEquals

object TalkGroupSpec : Spek({
    describe("SortedSet") {
        val tg1 = sortedSetOf<String>("佐藤", "鈴木", "田中", "", "")
        val tg2 = sortedSetOf<String>("鈴木", "佐藤", "", "田中", "")

        describe("if there are 2 SortedSet have same members different order") {
            it("method equals() should return true") {
                assertEquals(tg1, tg2)
            }
            it("method hashCode() should return same value") {
                assertEquals(tg1.hashCode(), tg2.hashCode())
            }
        }
        describe("SortedSet as Map key") {
            val map = hashMapOf<TreeSet<String>, Int>()
            //
            assertEquals(null, map[tg1])
            assertEquals(0, map.getOrDefault(tg1, 0))
            map[tg1] = map.getOrDefault(tg1, 0) + 1
            map[tg2] = map.getOrDefault(tg2, 0) + 1

            assertEquals(2, map.getOrDefault(tg1, 0))
        }
    }
})

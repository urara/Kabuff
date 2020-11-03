package id.urara.domain

import id.urara.logic.TalkRoomGenerator
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import java.util.*
import kotlin.test.assertEquals

object TalkRoomGeneratorSpec : Spek({
    describe("TalkRoomGenerator") {
        describe("generateRoom") {
          it("when attenance num = 6 should have 2 TalkGroup") {
              var attendance = arrayOf("佐藤", "渡辺", "田中", "鈴木", "高橋", "斉藤")
              var talkRoom: TalkRoom = TalkRoomGenerator().generateRoom(attendance)

              assertEquals(sortedSetOf("佐藤", "渡辺", "田中"),talkRoom.talkGroups[0].membersSet)
              assertEquals(sortedSetOf("佐藤", "田中", "渡辺"),talkRoom.talkGroups[0].membersSet)
              assertEquals(sortedSetOf("鈴木", "高橋", "斉藤"),talkRoom.talkGroups[1].membersSet)
          }
        }

    }
})

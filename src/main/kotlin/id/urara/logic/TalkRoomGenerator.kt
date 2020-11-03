package id.urara.logic

import id.urara.domain.TalkGroup
import id.urara.domain.TalkRoom
import java.util.*

class TalkRoomGenerator {
    fun generateRoom(attendees: Array<String>): TalkRoom {
        val talkGroups: List<TalkGroup> = when(attendees.size){
            6 -> listOf(TalkGroup(sortedSetOf(*attendees.sliceArray(0..2)))
                    , TalkGroup(sortedSetOf(*attendees.sliceArray(3..5))))
            else -> listOf(TalkGroup(sortedSetOf("")))
        }
        return TalkRoom(talkGroups)
    }
}

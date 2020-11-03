package id.urara.domain

import java.util.*

data class TalkRoom (val talkGroups: List<TalkGroup>) {

    fun show() {
        for(talkGroup in talkGroups) {
            talkGroup.showMember();
        }
    }
}
package id.urara.domain

import java.util.*

data class TalkGroup(val membersSet: TreeSet<String>) {
    fun showMember() {
        print("Team:")
        for(member in membersSet) print(member)
        print("¥n")
    }

}

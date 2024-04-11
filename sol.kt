class Solution {
    fun isPalindrome(s: String): Boolean {
        val chars = cleanString(s.toCharArray())
        var i = 0
        var j = chars.size - 1

        while (i < j) {
            if (compareChars(chars[i], chars[j])) {
                i++
                j--
            } else return false
        }

        return true
    }

    private fun cleanString(chars: CharArray): CharArray {
        val result = mutableListOf<Char>()
        for (char in chars) {
            if (!isSpecialChar(char)) {
                result.add(char)
            }
        }
        return result.toCharArray()
    }

    private fun compareChars(char1: Char, char2: Char): Boolean {
        return char1.equals(char2, true)
    }

    private fun isSpecialChar(char: Char): Boolean {
        return !(char.code in 65..90 || char.code in 97..122 || char.code in 48..57)
    }

}

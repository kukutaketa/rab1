fun main() {
    print("Введите строку:")
    val input = readLine() ?:""
    val charCounts=
        countCharacters(input)
    charCounts.entries.sortedBy
    {it.key}. forEach {println("${it.key}-${it.value}") }


}
fun countCharacters(input: String): Map<Char, Int> {
    val charCounts =
        matableMap0f<Char, Int>()
    for (char in input){
        charCounts[char]=
            charCounts.get0rDefault (char, 0)
        +1
    }
    return charCounts
}
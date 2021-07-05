fun main(){
    println(removeVowels("kotlin Programming Language"))

}
fun reVow(a: String): String{
    val re = StringBuilder()

    for (c in a){
        if(c != 'a'&& c != 'e' && c != 'i' && c !='o' && c != 'u')
        {
            re.append(c)
        }
    }
    return re.toString()
}
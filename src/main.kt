fun main() {
   var s= names(arrayOf(12,34,43))
    println(s)
    var e=mixed(arrayOf(12.0,"Sharon",6.0,13,65))
    println(e)
    var t=character(arrayOf('a','d','c','e','f','i','p','o','u'))
    println(t)

}fun names(name:Array<Int>):Int{
    var multiply= 1
    name.forEach { f->
        multiply*=f
    }
    return multiply
}
fun mixed(j:Array<Any>):Double{
    var b= 0.0
    j.forEach { k->
        if(k is  Double ){
            b+=k
        }
    }
    return b
}
fun character(l:Array<Char>):Int{
    var each=0
    l.forEach { vowel->
        if(vowel=='a'|| vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u'){
            each++
        }
    }
    return each
}
package com.example.coroutinebasics.practice1

/**
 * Created by Nishant Kumar on 03-February-2022.
 */

import java.util.regex.Matcher
import java.util.regex.Pattern

fun main() {
    //replaceWithUnderscore()
//    replaceWithWhiteSpace()
}

fun matchOnlyWhiteSpaceDuplicates(s: String) {
    //val s = "PUNE PUNE"
    val p1: Pattern = Pattern.compile("([^ ]*[a-zA-Z0-9]+[^ ]*(?![^ ]))(?=.*(?<![^ ])\\1(?![^ ]))", Pattern.CASE_INSENSITIVE)
    val m: Matcher = p1.matcher(s)
    println(m.find())
}

fun matchAllDuplicates(s: String) {
    //val s = "PUNE PUNE"
    val p1: Pattern = Pattern.compile("((?<![^\\W_])[a-zA-Z0-9]+(?![^\\W_]))(?=.*(?<![^\\W_])\\1(?![^\\W_]))", Pattern.CASE_INSENSITIVE)
    val m: Matcher = p1.matcher(s)
    println(m.find())
}
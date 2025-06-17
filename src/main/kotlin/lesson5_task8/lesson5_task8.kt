package org.example.lesson5_task8

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

fun main() {

    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations").get()
    val element: Elements = doc.select("div.sc-2aegk7-2")
    val quotes = element.text()
    println(quotes)
    println(element)

}

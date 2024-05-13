package org.example.urok22_zadacha1

fun main() {
    val oldWorker: Int = 50
    val oldWorkerSalary: Int = 30000
    val newWorker: Int = 30
    val newWorkerSalary: Int = 20000
    val allOldWorkerSalary: Int = (oldWorker*oldWorkerSalary)
    val allWorkerSalary: Int = (oldWorker*oldWorkerSalary+newWorker*newWorkerSalary)
    val average: Int = (allWorkerSalary/(oldWorker+newWorker))
    println(allOldWorkerSalary)
    println(allWorkerSalary)
    println(average)

}
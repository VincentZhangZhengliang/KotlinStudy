package 接口

/**
 *  Package:接口
 *  User:Vincent
 *  Date:2017/11/22 14:03
 *  Dsc:
 */

interface ProjectService {

    val name: String
    val owner: String

    fun save(project: Project)
    fun print() {
        println("I am project")
    }
}

class Project

class Milestone

interface MilestoneService {

    val name: String
    val owner: String get() = "jack"

    fun save(milestone: Milestone)

    fun print() {
        println("I am Milestone")
    }
}




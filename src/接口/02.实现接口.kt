package 接口

/**
 *  Package:接口
 *  User:Vincent
 *  Date:2017/11/22 14:14
 *  Dsc:
 */


class ProjectServiceImpl : ProjectService {

    override val name: String
        get() = "接口实现"
    override val owner: String
        get() = "Vincent"

    override fun save(project: Project) {

        println("I am ProjectServiceImpl")

    }

}


class MilestoneServiceuImpl : MilestoneService {

    override val name: String
        get() = "MilestoneServiceImpl name"

    override fun save(milestone: Milestone) {
        println("save Milestone")
    }

}
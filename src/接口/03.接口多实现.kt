package 接口

/**
 *  Package:接口
 *  User:Vincent
 *  Date:2017/11/22 14:22
 *  Dsc:
 */

class ProjectMilestoneServiceImpl : ProjectService, MilestoneService {

    override val name: String
        get() = "ProjectMilestone"

    override val owner: String
        get() = "Jack"

    override fun save(project: Project) {
        println("Save Project")
    }

    override fun print() {
        super<MilestoneService>.print()
        super<ProjectService>.print()
    }


    override fun save(milestone: Milestone) {
        println("Save Milestone")
    }


}

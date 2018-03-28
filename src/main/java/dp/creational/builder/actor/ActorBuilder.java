package dp.creational.builder.actor;

/**
 * project: design-pattern
 * class: ActorBuilder
 * author: zhaokl
 * creationTime: 2018-03-18 16:18:28
 * version: 1.0
 * desc: 抽象建造者
 * <p>
 **/

public abstract class ActorBuilder {

	protected Actor actor = new Actor();

	public abstract void buildType();

	public abstract void buildSex();

	public abstract void buildFace();

	public abstract void buildCostume();

	public abstract void buildHairstyle();

	public Actor createActor() {
		return actor;
	}
}

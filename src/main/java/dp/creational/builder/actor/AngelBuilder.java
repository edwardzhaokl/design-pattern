package dp.creational.builder.actor;

/**
 * project: design-pattern
 * clazz: AngelBuilder
 * author: zhaokl
 * creationTime: 2018-03-18 17:59:16
 * version: 1.0
 * desc: ConcreteBuilder 角色: 天使建造者
 * <p>
 **/

public class AngelBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("angel type");
	}

	@Override
	public void buildSex() {
		actor.setSex("angel sex: female");
	}

	@Override
	public void buildFace() {
		actor.setFace("angel face");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("angel costume");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("angel hairstyle");
	}
}

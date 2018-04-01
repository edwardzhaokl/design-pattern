package dp.creational.builder.actor;

/**
 * project: design-pattern
 * clazz: HeroBuilder
 * author: zhaokl
 * creationTime: 2018-03-18 16:21:50
 * version: 1.0
 * desc: 具体建造者 hero
 * <p>
 **/

public class HeroBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("hero type");
	}

	@Override
	public void buildSex() {
		actor.setSex("hero sex: male");
	}

	@Override
	public void buildFace() {
		actor.setFace("hero face");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("hero costume");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("hero hairstyle");
	}

}

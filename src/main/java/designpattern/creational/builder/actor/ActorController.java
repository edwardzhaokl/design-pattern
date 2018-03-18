package designpattern.creational.builder.actor;


/**
 * project: design-pattern
 * class: ActorController
 * author: zhaokl
 * creationTime: 2018-03-18 16:26:02
 * version: 1.0
 * desc: Director 角色
 * <p>
 **/

public class ActorController {

	private ActorBuilder builder;

	public ActorController(ActorBuilder builder) {
		this.builder = builder;
	}

	public Actor construct() {
		builder.buildType();
		builder.buildSex();
		builder.buildCostume();
		builder.buildFace();
		builder.buildHairstyle();

		return builder.createActor();
	}

	public Actor construct(ActorBuilder builder) {
		builder.buildType();
		builder.buildSex();
		builder.buildCostume();
		builder.buildFace();
		builder.buildHairstyle();

		return builder.createActor();
	}
}

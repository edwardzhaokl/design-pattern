package dp.structural.proxy.search;

/**
 * project: design-pattern
 * class: Searcher
 * author: zhaokl
 * creationTime: 2018-04-03 23:18:50
 * version: 1.0
 * desc: 抽象主题
 * <p>
 **/

public abstract class Searcher {

	public abstract String doSearch(String userId, String keyWord);
}

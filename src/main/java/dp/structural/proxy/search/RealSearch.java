package dp.structural.proxy.search;

import lombok.extern.slf4j.Slf4j;

/**
 * project: design-pattern
 * class: RealSearch
 * author: zhaokl
 * creationTime: 2018-04-03 23:20:26
 * version: 1.0
 * desc: 真实主题
 * <p>
 **/

@Slf4j
public class RealSearch extends Searcher {

	@Override
	public String doSearch(String userId, String keyWord) {
		log.info("RealSearch::doSearch::parameters:{ " + "userId = [" + userId + "], keyWord = [" + keyWord + "]" + "}");
		
		return null;
	}
}

package dp.structural.proxy.search;

/**
 * project: design-pattern
 * class: ProxySearcher
 * author: zhaokl
 * creationTime: 2018-04-03 23:21:38
 * version: 1.0
 * desc: 代理
 * <p>
 **/

public class ProxySearcher extends Searcher {

	private RealSearch realSearch = new RealSearch();

	@Override
	public String doSearch(String userId, String keyWord) {

		if (validator(userId)) {
			String result = realSearch.doSearch(userId, keyWord);
			log(userId);
			return result;
		}

		return null;
	}


	private boolean validator(String userId) {
		AccessValidator accessValidator = new AccessValidator();
		return accessValidator.validator(userId);
	}

	private void log(String userId) {
		Logger logger = new Logger();
		logger.log(userId);
	}

}

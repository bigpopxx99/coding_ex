import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class ShortestCompletingWord {

	public static String shortestCompletingWord(String licensePlate, String[] words) {
		
		HashMap<Character, Integer> lpHashMap = new HashMap<>();
		int lpLength = 0;
		for (int i = 0; i < licensePlate.length(); i++) {
			char lowcaseChar = licensePlate.toLowerCase().charAt(i);
			if (lowcaseChar <= 'z' && lowcaseChar >= 'a') {
				lpLength++;
				if (lpHashMap.containsKey(lowcaseChar)) {
					lpHashMap.put(lowcaseChar, lpHashMap.get(lowcaseChar)+1);
				}else {
					lpHashMap.put(lowcaseChar, 1);
				}
			}
		}

		ArrayList<String> wordsArray = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() >= lpLength) {
			    wordsArray.add(words[i]);
			}
		}
		wordsArray.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		for (int i = 0; i < wordsArray.size(); i++) {
			HashMap<Character, Integer> hashMap = new HashMap<>();
			String s = wordsArray.get(i).toLowerCase();
			for (int j = 0; j < s.length(); j++) {
				if (hashMap.containsKey(s.charAt(j))) {
					hashMap.put(s.charAt(j), hashMap.get(s.charAt(j)) + 1);
				} else {
					hashMap.put(s.charAt(j), 1);
				}
			}
			boolean found = true;
			Iterator<Character> iterator = lpHashMap.keySet().iterator();
			while (iterator.hasNext()) {
				char key = iterator.next();
				if (!hashMap.containsKey(key) || (hashMap.get(key) < lpHashMap.get(key))) {
					found = false;
					break;
				}
			}
			if (found) {
				return wordsArray.get(i);
			}
		}
		return null;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] t11 = { "step", "steps", "stripe", "stepple" };
		String t12 = "1s3 PSt";
		String[] t21 = { "looks", "pest", "stew", "show" };
		String t22 = "1s3 456";
		String[] t31 = {"measure","other","every","base","according","level","meeting","none","marriage","rest"};
		String t32 = "GrC8950";
		System.out.println(shortestCompletingWord(t12, t11));
		System.out.println(shortestCompletingWord(t22, t21));
		System.out.println(shortestCompletingWord(t32, t31));

		String[] tt = { "even", "oh", "business", "at", "grow", "represent", "pass", "use", "themselves", "always",
				"special", "unit", "remain", "employee", "her", "hand", "both", "space", "everyone", "until", "stay",
				"week", "improve", "nor", "head", "future", "continue", "serious", "seat", "responsibility", "movement",
				"experiencing", "sit", "different", "increase", "parent", "disease", "society", "meet", "myself",
				"accept", "game", "present", "fund", "hospital", "time", "explain", "already", "soon", "individual",
				"problem", "be", "up", "protect", "artist", "policy", "support", "wish", "include", "investment",
				"energy", "environmental", "pressure", "case", "matter", "teacher", "measure", "willing", "laugh",
				"sea", "act", "red", "sister", "your", "color", "fear", "rate", "think", "rise", "image", "keep", "air",
				"admit", "animal", "character", "imagine", "ask", "a", "house", "fish", "kitchen", "become", "real",
				"per", "middle", "wall", "minute", "station", "site", "factor", "point", "member", "property", "know",
				"run", "southern", "national", "weapon", "we", "sometimes", "also", "child", "executive", "old",
				"yourself", "area", "crime", "ball", "show", "beyond", "author", "lawyer", "no", "foot", "economic",
				"worker", "back", "newspaper", "need", "shoot", "along", "style", "movie", "himself", "necessary",
				"under", "table", "common", "trade", "lay", "guess", "agent", "certain", "town", "bill", "break",
				"something", "weight", "growth", "model", "piece", "civil", "central", "fast", "money", "establish",
				"whole", "wondering", "project", "campaign", "fight", "require", "eye", "sound", "perform", "our",
				"tax", "leg", "almost", "top", "director", "rock", "rather", "financial", "mother", "majority",
				"however", "generation", "maybe", "test", "but", "expert", "white", "television", "listen", "war", "it",
				"strategy", "lead", "far", "throw", "reveal", "chair", "year", "another", "senior", "dark", "rule",
				"center", "gas", "feel", "cell", "resource", "hold", "either", "activity", "carry", "and", "major",
				"voice", "day", "bit", "effect", "draw", "shake", "work", "alone", "simple", "church", "over", "anyone",
				"sense", "direction", "play", "final", "shoulder", "moment", "actually", "near", "down", "century",
				"example", "account", "enjoy", "budget", "situation", "successful", "black", "everybody", "trial", "ok",
				"make", "open", "control", "place", "against", "same", "manager", "job", "election", "effort", "sexual",
				"contain", "none", "too", "leader", "seek", "floor", "professor", "picture", "occur", "interview",
				"eat", "song", "management", "fail", "section", "ready", "production", "item", "police", "event",
				"left", "travel", "will", "way", "heavy", "look", "just", "prepare", "so", "early", "six", "evidence",
				"operation", "suddenly", "him", "hundred", "own", "big", "death", "phone", "certainly", "yeah", "rich",
				"ability", "charge", "suggest", "administration", "officer", "impact", "follow", "camera", "probably",
				"home", "during", "deal", "month", "star", "baby", "stock", "spring", "call", "goal", "relate", "staff",
				"they", "difference", "worry", "decision", "law", "talk", "welcome", "entire", "three", "since", "find",
				"eight", "nature", "similar", "understand", "discuss", "order", "service", "dog", "cut", "still",
				"coach", "girl", "wide", "reality", "argue", "rest", "read", "sell", "threat", "course", "now", "firm",
				"beat", "person", "country", "or", "thank", "north", "billion", "say", "late", "kid", "democratic",
				"computer", "build", "wind", "hope", "city", "partner", "few", "couple", "would", "among", "across",
				"ever", "indeed", "quality", "class", "woman", "consider", "welcoming", "single", "particular",
				"market", "audience", "without", "welcomed", "describe", "personal", "could", "cancer", "idea",
				"whatever", "machine", "free", "see", "join", "ahead", "much", "window", "million", "south", "message",
				"very", "official", "working", "wrong", "usually", "community", "fill", "finger", "economy", "age",
				"conference", "hot", "once", "former", "art", "reason", "seem", "dead", "my", "population", "serve",
				"natural", "theory", "debate", "hour", "deep", "oil", "issue", "from", "feeling", "friend", "whom",
				"car", "of", "check", "many", "happy", "involve", "their", "key", "then", "change", "statement", "bar",
				"may", "general", "high", "popular", "suffer", "whether", "environment", "do", "believe", "help",
				"drop", "us", "write", "seven", "close", "article", "might", "hang", "blue", "pull", "blood",
				"organization", "within", "kill", "fall", "surface", "water", "trip", "where", "memory", "clearly",
				"federal", "fine", "beautiful", "treat", "that", "smile", "later", "maintain", "should", "including",
				"hotel", "step", "compare", "let", "power", "win", "she", "reach", "interest", "exactly", "vote",
				"summer", "realize", "morning", "two", "tend", "develop", "peace", "knowledge", "move", "create",
				"experienced", "cause", "like", "everything", "perhaps", "record", "share", "this", "mouth", "finish",
				"go", "full", "provide", "assume", "system", "thus", "office", "evening", "positive", "participant",
				"sort", "true", "come", "painting", "born", "best", "owner", "send", "sport", "address", "least",
				"writer", "the", "value", "scene", "science", "die", "five", "mention", "upon", "raise", "possible",
				"language", "remove", "sure", "result", "nearly", "court", "enough", "toward", "third", "development",
				"likely", "there", "authority", "have", "loss", "dream", "tonight", "skill", "meeting", "before",
				"board", "news", "stuff", "history", "heat", "around", "turn", "culture", "pain", "light", "sign",
				"program", "lie", "poor", "quite", "body", "give", "relationship", "public", "plan", "such", "stage",
				"cover", "technology", "store", "according", "allow", "film", "large", "stand", "thousand", "hair",
				"you", "name", "green", "outside", "bring", "why", "new", "appear", "thought", "cultural", "not",
				"customer", "take", "save", "truth", "any", "determine", "term", "stop", "physical", "notice", "front",
				"lot", "type", "able", "prove", "force", "care", "period", "state", "edge", "private", "often",
				"college", "training", "religious", "garden", "opportunity", "size", "sex", "hear", "social", "lose",
				"long", "foreign", "itself", "quickly", "simply", "student", "view", "family", "soldier", "what",
				"teach", "wait", "affect", "remember", "bad", "industry", "concern", "attorney", "walk", "next", "skin",
				"above", "nice", "ago", "education", "he", "when", "past", "standard", "benefit", "recently",
				"commercial", "right", "region", "option", "watch", "base", "available", "method", "others", "tell",
				"military", "instead", "guy", "wife", "paper", "forward", "throughout", "receive", "spend", "race",
				"brother", "inside", "half", "heart", "after", "recognize", "exist", "trouble", "young", "try",
				"purpose", "challenge", "night", "else", "want", "who", "process", "daughter", "choice", "chance", "as",
				"local", "first", "role", "love", "career", "specific", "gun", "wishing", "by", "manage", "which",
				"yes", "set", "push", "capital", "field", "really", "behavior", "success", "figure", "question", "me",
				"short", "arrive", "little", "recent", "group", "mean", "choose", "to", "with", "while", "most", "line",
				"experience", "collection", "sing", "visit", "street", "media", "get", "cost", "drive", "anything",
				"enter", "cold", "each", "offer", "agreement", "life", "speak", "great", "room", "last", "about", "how",
				"approach", "attention", "forget", "claim", "pay", "position", "report", "school", "out", "behind",
				"analysis", "current", "political", "player", "speech", "human", "well", "road", "better", "identify",
				"marriage", "one", "degree", "drug", "add", "structure", "range", "health", "bank", "kind", "data",
				"food", "bag", "although", "only", "institution", "put", "total", "avoid", "because", "victim", "huge",
				"consumer", "together", "clear", "season", "particularly", "safe", "box", "wonder", "medical", "thing",
				"hard", "on", "discover", "for", "list", "all", "live", "onto", "traditional", "good", "someone", "cup",
				"treatment", "letter", "president", "away", "whose", "respond", "return", "in", "strong", "modern",
				"adult", "building", "interesting", "agency", "response", "card", "his", "plant", "professional",
				"politics", "note", "condition", "though", "shot", "again", "start", "product", "significant",
				"especially", "tough", "other", "defense", "book", "team", "company", "attack", "some", "detail",
				"subject", "less", "if", "husband", "level", "son", "fact", "action", "can", "prevent", "these",
				"mission", "international", "reduce", "miss", "more", "page", "various", "them", "happen", "research",
				"door", "somebody", "yet", "discussion", "small", "glass", "than", "people", "tree", "fire", "answer",
				"focus", "buy", "information", "ground", "design", "decide", "mind", "boy", "learn", "produce",
				"western", "world", "decade", "doctor", "every", "side", "part", "risk", "arm", "man", "four", "apply",
				"into", "those", "east", "important", "its", "government", "despite", "scientist", "form", "music",
				"legal", "nation", "ten", "pretty", "face", "second", "pick", "father", "off", "west", "practice",
				"security", "worrying", "material", "easy", "source", "radio", "difficult", "agree", "low", "patient",
				"word", "performance", "amount", "network", "never", "fly", "yard", "main", "hit", "pattern", "story",
				"land", "indicate", "finally", "magazine", "catch", "through", "candidate", "here", "nothing", "must",
				"herself", "today", "series", "end", "study", "dinner", "violence", "score", "number", "reflect",
				"expect", "party", "several", "citizen", "begin", "leave", "price", "bed", "between", "task", "wear" };
		String ttl = "EEReCIv";
		System.out.println(shortestCompletingWord(ttl, tt));
	}

}

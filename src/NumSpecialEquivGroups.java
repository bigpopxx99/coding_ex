import java.util.Arrays;

import org.omg.PortableInterceptor.IORInterceptor;

public class NumSpecialEquivGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] t1 = { "a", "b", "c", "a", "c", "c" };
		String[] t2 = { "aa", "bb", "ab", "ba" };
		String[] t3 = { "abc", "acb", "bac", "bca", "cab", "cba" };
		String[] t4 = { "abcd", "cdab", "adcb", "cbad" };
		String[] t5 = { "kepoyfqjvtnqafzqioau", "ypukyizqmhbzebfzmpmo", "mclviqmkxdrfvuivdnpv", "jebfemhyjzpbcxonfsyt",
				"bocbssbqvpxliungyvfq", "cjxteaoarbxtuefeoobl", "qzlvksumbbwuaqoijctc", "stqdmmbqytwnxqevysja",
				"fvfhxtysnmlpvgvkilht", "rqgkfndfkzbftewfugqb", "aheyjiaixlxotcbtoedl", "smmoofsoolbttnjxtmyr",
				"ydsrpkdacukdjbohkwak", "roliqvplmzvuftxhkikw", "xgqwyugbtxbcowdzwjeo", "jxfkuewdsvpounrylrqi",
				"msofgbbeibhcmadlrgnw", "dfysouekzqbmfljejvgo", "jrsfrdnxeppizgygmnpq", "zrgsqngbiiwrvzlzntxo",
				"fqixzukvkfdvqjarbvwa", "zzejzhiuaavxxlmnblgm", "baypzrmpqjzystxlaajl", "pvbssealyrkmqzilkdqp",
				"gptvatipxoggefkqbfkj", "levmqiqwudpyvzdqevnj", "zgtkwstmethmnwfducad", "vnyjoriqyxcpisprqlma",
				"gnynllvgniqamxwfnpnr", "phxquefyfdapiqxhmetf", "uyquwkekgxagqigkzshp", "njpusklznememrirwdcy",
				"tzphyexjufksuqxptszv", "qzfnbzjqinrtqycsnxet", "jzdlnbyasfyczxnwhnxp", "iuyzxwdweucywblbtqim",
				"nmqkfkckgtcyaoqqwcbq", "jmaqhfmkqzfprpbmdgea", "lmwmtnhpwmwdvbnddbif", "ayouqkdytmfsfsosnktm",
				"ngavqvhbrxtvkxmoiwbw", "maqlyvmfarzbdahzawae", "gvkvpocibyugxdmzzoqz", "tjwdqbjpbpvkciigbfuz",
				"xibapaofibyezthzbmae", "ekfzbcgmwmjmmfnrntua", "vtgptnmxbaouvhpeqwfh", "dpclcucogesxtptipaus",
				"jqrfnzbvzvrmlhxqgsgp", "uzxynjucsqenztynuomb", "yfqaqysnbphchqmvakqv", "tjgqalzssxswkayhefod",
				"topetjrgwcjhdqprovdt", "ifjwbmwxmjfhkkwgrsju", "tjwuvmsvatigvtxoyuin", "cptmdjueaxegcqsfrjbt",
				"vxycdtvwiutuhhhpyurv", "rmxcdjmicieuueahcgba", "rzeqvwrcaovqzjbqzlfx", "hzaaystwmroxylklqepd",
				"febolwojnaibgopztcnu", "tebsvlbdilsllenyrdsz", "oklmnrxvqqcckftjypov", "tnvalrtjklqdwzuklyzy",
				"eptllhtasfnlmyesiflp", "nyqgihduodnzyjhiludz", "rpjttktucpgvuyiwalyf", "qgtkgmkppugrwvkvfalw",
				"jazmjblkhndxsvmlkszp", "fqagwjlkujfgoxaxxonq", "itbowdwxycouqbqdeuat", "zsbfslfljtrppifebclu",
				"ipwcqpggmjpwhukvipcy", "mqtfsrpkoumejsaaomzu", "geubxhdaiixszknpbpwi", "rxeswvyadzwlhpabliwu",
				"rmufsntsuywzhktfvqvg", "kybbvmnaljfelwtnzpmd", "atswzputwnqwyblbdxcn", "ywmgpqpqmykbvteexmen",
				"rlmbxpcqevexnjbkgktx", "euzejzjdpsnjocvhjvpt", "skixuihcyfebjmbpwhtw", "lruitmrngvdnhlfssopf",
				"gxuuvjwdgadqiwslsyby", "hgbndrzozmdkxmwxojkn", "pjgauybbcfsmidbsspfl", "dyyltdsooyqijunrhnlb",
				"xeaqcujnzrogrzflwyer", "pztbnnkmqqsllpxdtwxz", "imewzljpfyumhjowakwc", "wjtkfacyvgjwhryamgrd",
				"ncoaqrwmruytezavtdct", "cykoyadduzwzcrtpebid", "fvmjowsmmxisyjpxmpnl", "xftpoziqhriqyzqturyi",
				"njtyqjznrahbonrualwa", "goaelavrvxrorgnprrbk", "ivkngqhbkyonuaqejkak", "xzhsseouaxprlzthakhn",
				"kigfewjsxsaoktnbjxfa", "clzkuzhdhucecmdjcloo", "rrhxjdhivhsoolmcaolk", "mvsswbthhzrjfkjiiqyo",
				"dnzptkzamsbseqpvuosy", "nhuwsllxemnwnskdcful", "ixrrymlyufdhsechnsmh", "hbztoxzmvjpgdzfdlkjt",
				"wadsiesyjfzbbbccnltc", "ejmxgvfqsihyledyralv", "wvniuqudwvasfpdiqpoq", "yjabkmgdtfcfnnjpgwmi",
				"qrnepucmqocxhdqmlzwx", "svdcubovznghlmtkvhcg", "qglblddwmybszngimbsl", "tagtpnvjzhvbsluplpsm",
				"lvrsrfayvzxjuqettiid", "bbhehvjkxpeaqfgseuoz", "jwomfujcyuulqzexyprg", "wxhwkxeejrxnkcwuwltp",
				"fecoebuweexyfixslton", "uaxtvjgigmwgvqtzydsj", "rfnahovcdygtmhtzzqkv", "pordmptiroimwodtbzff",
				"zlbwtrsvixlhqbgjinkj", "ipuektjaujzuxkenaqhm", "wrwlsnhcbvcanpcijfxw", "rgxlkhuullhvsokqgcye",
				"oypdawlnkxwyurqwuvps", "sczpaustrezriyltlbzv", "pdpwpfpvupqlluvwxzvj", "kyjxuphpdqxqetiogkrx",
				"uoaydeuqqamxctmudtoy", "lnsnhpffrbumqoykoiqn", "akhcbxyrddpenxeugigi", "ofvtskiubxlcqutmytpz",
				"nfgnkdcanpbkuczwehzv", "ofcksvuppnkrtqqlulfm", "tlyypyjmjeecjuwnrfxg", "suhykckyoaudkverabkv",
				"tmydpnymmhohvxxpshgr", "vbsxkcazscpicapzjwav", "vjiygsgdxsiklyyznqyf", "sygvbjcqcmdqozjzbayd",
				"ztsluxwytklrbdlyegiz", "qpznybaewybvtegldvmq", "tkhorgbmiimbpojzfcvx", "obstrelhqvxopkcyucfd",
				"xucdoaatxcjnpyvzzxdy", "mqptvffwiyyxwabloraa", "nbwtaerzggmcbpksuimd", "pylgbbmodvmfbzmnxpto",
				"trjnvjwacrpkoiocwmhk", "lecmprdwilbcallorvpl", "nlaavqgplroxtvwbdhkn", "qvgfaygvtdlkxintfgfd",
				"haswkmoyfuxjiscpiwyt", "zzgjvtlqxkeamftknvir", "ejxqamqxjnurzwvueaef", "psmuwonokexaengrahhf",
				"bvntgjbpjmtvazqqgatt", "ihtqdltcfrhbmlzvjvut", "xwrkonmngdwmcgvpzvyv", "xgwznfnyiewqjozvrnuh",
				"meonutfejpnawkkozbos", "ybfqnnxybwhridbezqic", "yzyvoepwzalzyiiphgpz", "ggakkrkuxvseehtwrhcm",
				"hppzwlheqjoosmmkfemb", "nwqtwpqfdqwtwuitqffm", "rxnsgvwusrfppwlxaanq", "negirsjuqprrpyhcoxjr",
				"bqinayfreqlgdlhkttaq", "qduuojcddxolvomhexuh", "ephwniboytwlljstfanf", "eafbilgmxhemofjxpqnp",
				"cxdwotosuemmpfjkxsrc", "taviyengzkenexyolgko", "favqnhqfssgfpteckqim", "obftohtnshfrvmzvyoev",
				"phqhqbqdnyloxbhspiox", "qeokbkkjpuegmahxytvn", "dljoomilolylffjbeeuo", "bvbycsvsqapwhtniopqf",
				"flicmhesjxyouqmykrsd", "rzkbxylxdyrhudpxdhhc", "jsavrvliktmrtqlfhwtr", "ccmnkpbgynvwnmwdzkcf",
				"yrllatfaowiguulkzqhy", "fkfivryaxaceohztvjxm", "ijtehekfzoiecefatisr", "psiokhwomziwqcrgirff",
				"uudnnofmwikjepzbiyuf", "tpcitrqdrbojknsrobqu", "suqxsxxbksgtnvvhpoyt", "vivkxwjbyeukefmsopqv",
				"adebkjbvuhgoaojuwtxd", "zusekefbpqprihdmcvnv", "dipspzkmaisfwlzhxotc", "fqxaufustigpkocdudbo",
				"pidxlxaozduzyzezjrbg", "whznwrdrdulgdmbjtguj", "ckdanozkgtfiencixzll", "tmwoqtrxjdkfvmtydftn",
				"hplpykjpoghqvgxcyeow", "flpbqarjoxzikdebdqut", "jqotaygvdzkkcqbzmloh", "vkvishrqyqplnvldbwjj",
				"eqcsctjvhihsigxiqind", "ktskpzbqnlmlacciilml", "zwlywfysksphiyhpmkge", "kypkypokjilsvkkkawbx",
				"lizljgktchbsznrhsjet", "yuqbpckcpabpdlzacnyl", "etqvjisrxongsrdxjmix", "etgnlzwqwjommxygfjiz",
				"csaqoppfdhnihneoizhf", "tqoxskkejijxfusymbgh", "ttbnhfyhvbuciwtpwrbw", "jjczphrfnoolmwzmrnlv",
				"etgtgauofwozoukoxhvj", "towjndmmqbihbxivsuqg", "ckjozjwwxbklfvoyzgjz", "gisvdgfwvfhiulasdplg",
				"zccvlkdjjoubzozkvzwm", "hnadygntslrcqauyjrjv", "czmtrmcxcvjdigwgjrxb", "cazyaebibdvvkanrddpn",
				"yfvghgjhrmevpmyvaoom", "kibxxcgmggunjlylchie", "ihzpdjspzttobtzrlesr", "oexirhhcrvlfjlkruekb",
				"hwaohqpiljsypxwvocvr", "akmzhtzkuxgvnbhmpbmf", "xnjmeyslpnepuhadyali", "ujlwfmuayqwnwybpmkim",
				"euzkwhpffrmevyiltbwg", "aoomnpufmkljdafdwilj", "gqgufxplpvkuarmzyvln", "nfvzepyleayauhswrehd",
				"qhtysftmtlaoryylvkbl", "bouhqlmtrmrijvhuubea", "dauzadqorsngjgkkrfid", "ebbwlyfegqeuohyfltcf",
				"valuarsckjdhadqpzkvr", "yprnyldalyjnqdwipggg", "wymqpvowkvemrydrxiid", "pxfbbdvkofgqybkelwqe",
				"tebhgigeklinqpqdaojh", "muswvnawtgsrmicqpnra", "mpooepkcxpytrkviommb", "bezcjbisvzezbtvlazlo",
				"eyzefycuomqupldlchpy", "bfaeiraxzqltvpdwbxtk", "annvgjtmfeaaxjyvbivh", "hvyueuxzdqtthhjlybnb",
				"blzpqfyihjudxxavvsmy", "yfibjlphdqglyoyixxlu", "iyjyjfiodajcezlqpqoq", "ixjfldfqgkqaxpvlwqwp",
				"qaalnycdcnkhqqmnsnah", "daeoobczlgddwjhggbam", "ccdtvyuuogrdshncdftw", "ykbqhhfabbwtnphxypnm",
				"ymaqvyyvabdsoarxbyhi", "emxyckxayidgkcshzmoc", "hhbjyejmelankvdhbpni", "bqavmrwdozrlquolekwi",
				"zrwgwjosrauywwwfqoms", "jghwvwqtcwjcytjmrvew", "crhwueofzffcyszmgswj", "pmgfufgoyaoqebxmsqyt",
				"acxeiqcvczgwoujrxzqe", "cqwsoksoagqfuwgnwqid", "bgpgbxjqnyltwibdqlpw", "tzwqltsilazgqiqrfbfw",
				"gnraxakoqwzcwqphojpj", "hudawdfyiltkvgzqqtmm", "lhlyqmdowiimdmvatuti", "fgkgozyqnnmlirlvtbuv",
				"bhiaxkytawotifbqmtld", "aaamfpqqeefaiggnxbwg", "qxbpdxixacdgcxtlfukn", "svfqanfksdfnylauhmpe",
				"osawfnxrqtaibcolkqan", "xjgvbtjleoeyqjswoiue", "oypibqrgqqdsrydkbeev", "hbpjtaftflvzpcerklaw",
				"benmqitqzhxgeteszcjg", "fqotihfceuqweyduyqze", "bmxuelqxkxlwxzmaphrr", "yjvllyffaztqnjiezakf",
				"eqzbuiscvnbnhrfcrczh", "zhwuppypypikkvzlontc", "zrcrqmokypgtgenbefek", "zbvinmtzqqfgibbrtono",
				"caqhzhzxexphpszabfrq", "gidiszvqexrulqjirraf", "ofvjtoyxpspworwylvmo", "ufrlmytteayfcixkhqtr",
				"qnbtgczlktzpdlwxrrhb", "mokxttufpetighbmebii", "daektcorwwehjhqalhzk", "ernutclitzhhazrkvfbk",
				"eanvgufqagqvnqgevvst", "xfcyrejxaaayytvwvvng", "nqmuhatjllfcwlnhbtae", "jexzrahqohikxxuwkbuj",
				"vjxauvtssvwjtaynftpr", "jgrvcnslqmcvafpwduic", "bvrnvpeofqfibfpaeqxc", "pwatfkvuhpjpehbscszj",
				"hzshwbyawjdiqlxtfksw", "akkzrsscripbfdwnxjei", "rramcfsqfppjozjkeudg", "swbpvvrsnqgkqqnijaxd",
				"xqsoxrwuazevlvorgsun", "jzupiraiiqdtaulzykec", "wcaakgifithxsiwvizrd", "ysvczapydzvdgmkelyzf",
				"oqmearrzhgvauyznhucm", "vgcdejgslphjgtvvlqjo", "xgpiyceqkipjlciryjod", "jwospkkqfippeebeqcwv",
				"rmjuwsiobsbgykcutfmx", "yqrfxghbrjotbbxfnjwa", "yrgwexymoxualjxwondh", "rleilsvyaczsmrkenxfe",
				"lcyberxarxsnbmjsolqb", "ytwrneettwgnswudyhvz", "itxfijqranevnczndxjv", "sqhkkqgyctdwwttnipzc",
				"gbbyevpaobadxxnjotxy", "fdpitdqamdejjebcmsuw", "gwnglnqepcxbyfoxspyo", "celyaxcrparwryfkitkn",
				"ednspqzsmhbasejnifza", "qdcozvmwhuvwxwebfrzl", "gklocrymyqdibwtdlpda", "kiqxmfzviybyyicrhjkt",
				"ugqtzwgzncrynjtvrrzg", "uilwryoitjcrnpykaceo", "nwvgxmarzohnnssyfspd", "uzlatvrjtjcpjpfacrrk",
				"roczaveefajkoxpmxmkl", "thwpbyphgywbhztzxdrr", "rlcbxezezvxcsfiorwus", "yarpbzmptwwxmececfyn",
				"zarvaoclhvckhjzzamqx", "qaoylxkoqozfnxjiigej", "kxfqorahexwcjklmljup", "coytneugzeudtvjqaefj",
				"iqmqcrqnulgjaduwdxfd", "rtsqmvdagqzudzvgdewe", "moelvxkxmcbwzmqrrcdu", "wphtsurbcsjbmxspersz",
				"ergbfhbudazjddmyoybw", "hlkajkcrfyenggwmsybm", "nzvhcaazywgmsnjkvqlt", "fsajxriznyckbvaziejy",
				"enaexcfpjitneitoqhmm", "wxolvfjozbqqsrjediaw", "ewflhvxovzmrhqmdqjno", "jebtbowagatsvhdophsu",
				"pauiuqhzhhyqokafimuf", "milmwuaykmlkflysemem", "zxzhtxrvkplvlpdejnic", "uzvzgfqyswlvfstvqsuq",
				"rtofderllyiktpozypay", "jbvqbmewatcowxqehlqr", "edhiofzexhcvqfllgoaa", "tfjtzpyclhtznfajhxrt",
				"hqckykizggzfhamqhzxi", "vyxqrljixdtgtlcnrmxb", "pgbjjwimyavbvozliceo", "vqccxwkmuyyppbsiqpbd",
				"amwtqehulhwoyuivfmbw", "tatvderaugodlhjarcdf", "zqbbpmsgtypvexpyfpvj", "gkiarvnpucsomphjuvdo",
				"wupekfkjgxuknqnqrfvt", "umsahnrxkpeldwgsrkdl", "zkepoetdijxwdywzrdaz", "dbnzwkjdvucgewwjcqmy",
				"rhosdelsveosfnaoiokr", "gajpnzprqozhqaxsautf", "juuopdowsxlilyfuomjm", "dqbrvyrbgpifztzstksm",
				"ypjncbwvohczdwmnugvr", "usjfjpflhhjzzikozwra", "yuqrufuqynbaikiakeoz", "urzogqkxvbocaazyxtjc",
				"lidtmxndyqbixmulkwhd", "rsxlvndvxqsgbtiwggjr", "krsokbfljvauoazbqgzs", "qgnkahcyeqiptcitovhe",
				"jwzaczsnrilndrstrfqx", "jptaobwclxeigciqilzl", "dhbboipfmfxrhplgfsok", "jzzkqojyjjdplhfmlpqq",
				"lltjaamidxfbjnmmkljj", "mnioetkpoxmsmeldvtks", "nhwogyejjghqfvbintip", "qeygnygtpfehvsgpxyoo",
				"badlqckoxziwhjhmkxyu", "qzqzgtdjmoibejihvmrt", "ehpdprrxjjlhqltawviq", "stitihdbtreurksmlfqh",
				"dzfrebustkmmupxmlznh", "fterxupwfagfrzgaquza", "rfncyxobzhpsdtpoxlne", "qzgisrtfiumrclmtsclh",
				"uzsnhendkrgrrvppfylv", "vicpgcrpywcfpwsigfia", "lnjxexomyrdsmjfgibxt", "oufcxwuuevetxoncksmd",
				"zkmenxarvfojtttsolcz", "nxcbdfpdxekhdohskanr", "rogsbuhvuxeifgpyunin", "matikqjaelofdvpudgmy",
				"ozawnvjooklobtxsahob", "gmgycuvsgmflpfqisazr", "pfhdiyfmnoqdqipohslb", "ppksaijekgpltdpvaofe",
				"myxkyszwlkleinslprcq", "edowfqwihzpyqqnfjzlk", "gbfuukomldaggacvyqtq", "pptnumbssigrgrbylwmz",
				"nbpraojemcsqgvmoscmw", "fuqwpwdvphzbjaavohvd", "olciqvcngmwstwodkhiy", "ugburrisurzlmozbntjl",
				"ggpclufcurmtoagzoduv", "jycoklqeaaejnuwgswim", "awxnviwtetauhvvsgpyi", "zzhntptljsjgqsjnsbbq",
				"lakvnaevbdhxpsnscxtr", "bzvldyuaqspirngwhyqj", "dcxczfyhlkdngdaqncsv", "jpuhtjjycakqehjoxhpi",
				"jykxgzrnxlagwibnuihy", "wevnivjmpayqecmialwf", "szrxcexslqwjkdffmomh", "hlaoyzfwqsulpvmbgrbf",
				"ipybxasgydqlydhyhbav", "emfdzluekqmpqsgjxker", "evfzhlvregxuzaxmsaag", "rvvegkembsdmgndkaxjv",
				"ssdrbwoddtdzihrabnxz", "lszbhqxrmjsjdtnagpqq", "tvgufrgqbgdofwfxlude", "ciiodqfbsipagvjvxdck",
				"emcxmemxrtocqbodzvgu", "nkwjsdufizyzbvfthyzs", "wbqcihvigqsephwanrpq", "xnyqtifpliwpuseopmnn",
				"traowwslzwjdbnfcedjw", "oicsexzmwmexxqlwpbcd", "dscmcprnvljxmpwlheay", "csdujkgixdjknsqumqcg",
				"lknliexlunkjxrjpqcun", "ijrmnvwjielysaqdnbjm", "lpwllokzkgqgzwxfqely", "xoavztjopjdchwqpfdfv",
				"gaivwjmqqcooaqgzwrhx", "ihhcobqwaxbnextopoiu", "rfkfiyldsothvuugiqeh", "cvojjeckkqezwemkbbzk",
				"cbcdgjvvgxedbpgscnla", "mwerplpovtibupttxdiv", "cawmywqsuxhqgckcslas", "wnhohmlhremcgmibmtgo",
				"orufsnzxklrjiaetphbb", "trovwfeuhjepgfcdfuyx", "jbdjxawigepiaeoypwvy", "bkpxlobrqwnpdpvlidwe",
				"dyykxbfkojwwqofheset", "gjrtdvgeozysdtjvmthr", "alyeuibagsxessgijdcd", "oqvtsaikulwbsceeqjot",
				"belonvqlkssyagumtavq", "hqmstarrrmutspcqzjji", "yozhzsxthswryzjatqdn", "vgfgewldzrgysttvfnvu",
				"wvrkrptxtxerjcslqwvo", "ayeghyowqztpakcawlpj", "jdukajpkdvkvjjtnyezc", "yxmdiafkbfmihyxbgycn",
				"pwsfnjzzdgutzarhlzos", "vgjolmaxklxsrfgnlwap", "hjremruspfrqgltccyby", "eqsdhpccncsiqnnsmlqh",
				"ooozjmahxxkwefspdbyp", "hldnnqlcqswhgvzvkqle", "bpekxmtrdnrqabgociqu", "pdezngrkllmbclhbwuey",
				"mqfizmwatnfjxoztnerk", "ebhyoxcttzvjbynlmirv", "ydboppqvdindzcqvqwph", "zlupyiqrraxbzsddvebj",
				"tzctniegqnaxgmrqlfjz", "sgzzyqpucuzrzcrmqusk", "afruhyucoagdgfmqqibu", "dvyynoaxulmrzxyjqfps",
				"bpcannuwvhtkufcqomba", "lxzajjnvefyefzxewuda", "waaoxzpfxojwsjvbhyiy", "tkkzyxnsriqgxyjaofhy",
				"uedbilmthkxzueqzicqn", "rmathqlezmszyjwyshdt", "hpyhcvgocjkcmopgqxgs", "ivlmgteoghpgiwmnxpkb",
				"ltaaoqymujycufhgdgvl", "iwsubguvnrclyqystwoa", "zcgpwdbcokwchpjehghj", "juacddqvbknwreybpeii",
				"isyqvdrdeijfvbcnkzct", "vjyqctgzlivwmjtuvuiz", "nwnpgooxyuhhippwqtnw", "hwcskjvsvugiaucutexg",
				"fsqibyjhopkbmtkrrjrp", "vkrnyuhmtpvtyxuuwxfo", "bynxmcduzngjkfuubobc", "cjfcnhrzrtrebmomdwle",
				"cfszvxilxqsivzqqmvai", "ksuajkzxgffgnexfbofx", "hizqekhhotzznnihpfww", "csmlhdwtwzxgywzchwbo",
				"jwythpwygkeqyzhvesfj", "ttnzpjsdmulflogecips", "nyeeifavkrjtyhjnrvux", "fsprfshgfxxnwpwokybk",
				"ezohljtlimksbxrfvoxi", "oopseyyvrwtewfsecxae", "cxoqkvqblevmqplcuxxh", "rinijgmilnknefpnpcyf",
				"tyurutyshdgcjoxxpxdp", "xopuvgzwssznfhnywgee", "ftxumcnsoussnmaxoigx", "nzeocjgrxzdszlcvdwlj",
				"crwsyzvlztgtjdoptqwf", "chrtbegnkdggtpuvqhbv", "mwwoajqychclzgmcgbsd", "boctgvuditohxwpjnudm",
				"mjslprouscmhywivlhqe", "ipcrhqherwyvftbxbdux", "jagkxmqkvsttyvltbnej", "nchegaajwmgpsdeseswn",
				"xhulluwkhrpxtjyiupqw", "bddvkgdbzwvsilzuhouh", "wsnjejhpirbssgnaqazb", "fmbqmbmubgbtnobsrtek",
				"khbsuowwsdgfczqcykop", "plapnlwvjvvfxrpvltmq", "stbgejpculoakyggrsin", "rcpqisousgdhtrtqfbbe",
				"ujumvlylhxngzxevcsat", "weiudrxzznlqmxvvhlvd", "bjbsrcxiobbyyunpkuki", "acknoujhdogzsgwomiha",
				"xtiugcpgjsmaadqenyir", "gsrjdknczfdoumekfejn", "wdhkxodgqbgtxidkgyzj", "zvsjepzinrljbuyxgffx",
				"uirrsboosngmgsbeyyyc", "cjseaayeubfdszyqwjic", "hmwvfvbzlsrnzdigkrzt", "flmpeeflpwyhqsmslypk",
				"ntusrqqgidyxuewuahzm", "jucncujtbbvfopayqgzb", "sotztznvmclrpwuknarw", "jfdsumnzhooomhocmfof",
				"xdggkhldtgttyenkcftm", "whzmputfcgxrpnvcblgd", "xxjgurostpsqgjnorodn", "xfxhsxoiqlfvxnzhroam",
				"dpxalxkkwbbdjrcpenyb", "uuxnokizmkwicmrttcrv", "fldicvqsqdtkoylqvrzu", "rluqvejtdwsnqbspacld",
				"knizovklwektzodckrie", "rdgssysfsvxednklrlou", "qnrozciwknqdncwdvfca", "zlbfyldziquwrxcanuxr",
				"kxtzfbmuzscbbrkvfuzy", "omheaxkhjkbqmmthbdhf", "uvopslgafhoclppmpysi", "pshecylkctsgomqbeqqs",
				"zoylshygzedtyyjuwtkh", "gtqzcycixldjsrydpecu", "rugujsxrpadzdbrcvgmw", "zegvotlltfixmhyhbysz",
				"lmsqmuvxaprudrcschqb", "cahjrfimqnlmvinciuua", "sgcfzgpdfseofyfsnecq", "nncavdntgvmcpxfpojhh",
				"cucblbzjevppyrjzwpko", "smzdzcnusfqxddfvnhnk", "aophhbpnbmkjjxytqljq", "zfosjjuwxdwkkoyifbrc",
				"satevbphhquntmojxvwt", "kgzqkoyxmmhnmbgkvstz", "scmfvggwttjydwgwysuz", "ztflibpbgzwogpmkvyqf",
				"igwgwfzwiufrbbssxjlr", "zmwigawvkupytkzulkbv", "higntsdvxvpoxztusqnx", "hzmgmdiycgaizscmwzci",
				"tkhkfooaynwubuecebxx", "hopgmhqgjuxlwuzhjdag", "aqnxkfdddurwcdtkrtuk", "buxrzhtkaatjnzarodoy",
				"cfkawhdeostaqshibagx", "zmdllvhiyzystktyscud", "hqigftopsdwltqplvhid", "sdrosuytnnlhdsulxtny",
				"trckdolkrdcvaclfmhxx", "ulwyfyknotwlmqzxxnwy", "combjjxjtgjoyuxywruq", "hzmlbvcigeflhocxlboo",
				"keiequjoeyjzwnnwlexo", "pyglkfsdwkhoqrmaadzh", "ogflovdjmheouwfuoyzj", "mujsfzpuaisrejycrmjz",
				"qlgmifaniekwdiufapye", "qkghtjnuqebeejegfvnx", "tptcqzzplurjctlypxpf", "xhmyxabkgpzrbdqzouta",
				"svwjbbwxgxfhlhiycgip", "lfphunpocszrergtlafh", "xukfaiepcwvrrtzzpxsx", "swemrvprmvmclwgeghno",
				"brpwusowkzwmgivcenty", "umphyetfznganmorgong", "qnbrowmwrunrpxcvkana", "vgjpuyeqosnvjojjnymi",
				"bfjnznasmopnnzqddjao", "ivzgvvizaskttzdwlixt", "segvlhrgytaynwfmigux", "pebnwkllxfjwiqpiwlxd",
				"cnaoclhcsyjjkxavhnjn", "mfswdfrxwzdggupgmacy", "hfswfudpjjwgsozjddew", "lsxdrdxmkyfpmttsvgbo",
				"yrwthykszrdsgjizgcpl", "cezruprprzkibelshffx", "mdqgsvovecvxvblirnqr", "cbltjneppioomszmdjxg",
				"prccoofymzlxnvfqsraa", "jelkmuatpjxawywlgzlq", "sjxnwobvlkmzfnaabbdh", "qdzexuzsccbplcqttgtj",
				"hwxddzmwxnsuyzcesepj", "ioznqzcczirjhdmcujmb", "jfuuzvygiuwbjcvnxdck", "hqflklnjrdhciykzting",
				"bcutarkodcnbkepnvsyl", "oinoxftvariljdtnxgzt", "jjwzcxtvuifkbhhubnpw", "giicrbhaxpgddtasaeot",
				"xtfuauvicsxufoceedek", "ndixpnebdwvegxwpxjyl", "gnnpyvbqswthcspshize", "liqzjqadbkjrroyrrdyw",
				"ngcytihnkhkmdygwotmv", "gmypeyvfmfnqyghbrexj", "aitimrkcixemblrqrnkp", "qgbhudcslphrnfstnvsq",
				"xwyxmaufiemwrmilfvrh", "nztbtkeqbulodefzhmlx", "atazlrpzaxbmyoukbrme", "asxewhxbvyyxdcihxlho",
				"acdammbvexcttduegfoc", "mxugygkjllmadtutxysx", "bagtzgvxiqsimyyhaspp", "xxweiobipnwiafjcumqg",
				"fucmchxwmsagqzpsaofc", "wokntmbojuwaegepjesi", "gkgbgzhghvpvnrekaizn", "nuvtkbrwapgxcfqffmrv",
				"xvzgwlqhxqkbvyjiflca", "mqnfycczoubbwoapcfic", "zxhotnqkbnafveixskhl", "pehlbvwkuvmxasqftwbr",
				"zoalvbzsijtthktmxgdr", "zaqigsyfqyyezgdchmwh", "okfkzcuzxpbsldgxqjuy", "omemtqejyshspamsfqjx",
				"agkqmcgjwjhcnljbozsy", "cygbuwsfmpomtumdktkx", "bmusumkcstpvrvefyfda", "wxgisofeztcoxqxkjeaf",
				"evanskqwtmjlnufozcrr", "iakkvzokyhdsathbouxi", "iyjszjfkmkrjtjqfasiy", "myqudqipzlghwxzvthid",
				"rcsgqtnnfdfqborckcck", "luhthrmheoqbiqfhnxid", "wyemuofvxbotrctsowwh", "vldphndqxjgdooivnzjq",
				"trgejnhuettbghdmivwe", "disnjjphisjbrhrbercf", "rmkmzusvliyiwzacsldz", "uwuvmetemklhlowexzvp",
				"uleanphfcuqodvuutzil", "kcwfdjjxeowarhvwlczp", "wfvmvaombdiepsdunsep", "iyoferxkhispjosofrud",
				"quixltxabatjooezfsew", "stshwppupwkoaclojwqx", "zpevdnbjtcjiejadrrwr", "gajmxnpbxxorofblnwbw",
				"zmldikespeszeqjzfpbn", "inuzgutkjhewfxtaorgk", "lcevneqajeysjxgokbup", "snnepbavsulpyuizjyby",
				"zvzsulbevbsdtczxpkqw", "hrwzpwnyqdtckgiodbzz", "zhreqxgmlflfaqzxvula", "klbndljyatdjtjogvooy",
				"oueprlhgeeemfbymollc", "tfibylmsrmkzonaqhjdr", "eyaglssoputmdtbmbnvo", "nqzgzxnthuyprtgthcso",
				"rkyzrehxushmbxqouomz", "ddaoszrhfpzmonfmqttf", "oqvdvgjqjaxpzojxwbbe", "osfzwkfgllqkeatbswzd",
				"hucozjgeggmblltiecpy", "dqymsrvikycacixurlyk", "rgjedrkfveumlkcngjyj", "cvuoojriziwgrpuhguuf",
				"icsvpccldjnbgpeokhbq", "zswwfqjwlelostipnquj", "jgxluxlsszoxnuqnsrkp", "gkuzdhpwoozjlxppjzzr",
				"poqcrfmjmtwgnllmrtty", "tejcwbjjhceqrkcwoskz", "kqqvwyasitplzvogqnkb", "vqlpvpgylnyjwcrggazy",
				"rirmpfmsnvswatbtufju", "ofscqbazvoqlzuatysxp", "suadqlymgadwrefifzzu", "ejrmbgwaedlmzcifdznb",
				"bzppsjkscndnvcpijzby", "omabgqcqbhcefmmsdlrl", "ixwywfuosijqyvyejxdr", "mbmgzcqemdcjcdyxthij",
				"bhvrqovmqjqqmtliowhl", "chmekdwznjuzdyeolfmr", "zpngjvtxmcsuhbcmrilj", "vfkfikdlraeoghuboadi",
				"dtceqpxfyftujynikgbf", "sedrzomovqxfwnucwgxh", "bmazpfwbiatfqaervlwd", "jtulnpkytjlzynvqiakp",
				"qolrhuzrkgnztthilvxj", "nyiynemmqaloqcrbznmh", "ygopdcensyyajbhxdsjk", "ygghbztgtntuvtlsljlr",
				"rlkolcecxauxioqapxfq", "dhkeifhzfcgxtnepksrp", "inqfihcwlrtmnsvuccvk", "eiwclkurgnrjxpjdkgzt",
				"ovtmecfqpfwbaismrfsk", "ajhbsphlslcoxqkkvhfg", "tphnayrrrbylptejfuxk", "gtqsqcbyfddlvrsyvblk",
				"bclexlgteptjvkyhnmbb", "kguxmkuuwkdjdsosfxiy", "btmsqmcooojezbiytjuo", "astwonqrbrcoewkcskkv",
				"pqafuwwrmuwnvgpojhum", "sjwsqcrlktxlfrsowyam", "ohvoejanrupjeflwytcy", "owzegsljoucvbaqbimdx",
				"zvlwbnbgubnjyjxujzhr", "dzqrwdbljielyuobaedk", "hgyzxeeuunqfadukoitk", "wofqwcfmaiqslihfjkeg",
				"atuhiybiddaviwaygqze", "pqotpvffjzhycwgiplzt", "nqlcowabysnmmuipurju", "ivrtkzgsmnxlvjndrrwj",
				"saajpsrkhhztfspzlddq", "hgcpetmkuhheqgudkcqf", "uugychmgxlwdflutjkux", "kouaayefhbyqekpkiizv",
				"gjjkaxkzjukxkwicqvqr", "fbqcffgeaksmootmjxdn", "wvqfmhncsljaywdljtbn", "ravjgorqvorgepenlrkz",
				"qvuwgavkfxttsivwepto", "bzolfvzcyerrubsfxroq", "ogxvxmpkutmmgyjenidz", "aegnhvrlruyqeosbrpox",
				"kdhaklecnjnpgkjodgjj", "bdymumjpajhenyllcliz", "denepfqnvqgtrfyorhxn", "gkdjqpyedfjuvqqdwbrb",
				"lxpqfbczdwucltpfvabd", "rumddtyppjcmpamvzlnl", "vxyxhfknkzrzcrxgccdt", "wdczcakbknlfvvtxuhye",
				"adipambrwrgiylityvfl", "scykwpevzbetsefslxzn", "pywewryufnpztxetusbj", "jfuvpszslrxfnqttxwjd",
				"ebudhjjlvwmnczhpidvm", "jmkfpjobhekuqdgjxzqb", "jzxfnqydqtforbepicro", "oyxobnzvdgzptdsahfdi",
				"lkoyxkadntswkfakfyfh", "fzcfexfkamwpsczkpfzc", "yunsmnjisnsjjvjtlusj", "eafnawcwanawsmsyzubv",
				"pyhgvtffxloapjttscho", "qdpqblunexzcbfbctaol", "blzvxulgegeruvnzjpaj", "xhatnwhljxabjrbrcevf",
				"xgrhnxxiobouvqzobzpe", "rcrelzfmbeotcwdmrhnj", "hqlaeesymxdirvgylvfj", "wvlwoyuxqsudpypnkraw",
				"vdhjmzvwhbelipunjmcd", "jqwebrqxebctvmhoawql", "ybxqgxyfjiduihylpllo", "wezfcjgszrysffochmuw",
				"aawromrzcvtuytetqdnc", "aetkoxlhprxusshzanhz", "upeqzhmzypmkbomifbyz", "uetrggzopmymnhofgnna",
				"gyigljwhsxwxipbhcvfb", "hpickyqpmgcupvgpijww", "ohxxoixbzovebqrzngpu", "rrpijqedzfmgspygnxpn",
				"okoyarxhtjndbrauzzta", "bjozwotcewqbduyggxxw", "vbfatmbnljzeldkymwnp", "sybdrsvltdnzseleilbl",
				"sbrfbttqzpiyvkgmzsdr", "udkpqgqtuccehfmghhek", "oxjffmqodegmskanfbtc", "tmaixzplsopizfdhwcks",
				"jtjzpujdeczvnsvephoj", "twalhjekqgwzaycypaop", "zalwquoscmoxivbegjdb", "qosizfvrolwqjbjxawde",
				"hjjgyvbrljxwbnubzznu", "wjrmfknttozifnmazqxe", "nfwzewhdfqpqqzjkoily", "qrrxpsopgurynrhcjije",
				"qtvrhmjbcoeeqxwwaqbl", "obolueyldofleojmjfil", "sqhsobpeckcyqmlgetqs", "qrznjfntavdvenxcixij",
				"koyxehsdfsmlmcirjyuq", "nelweeqywejuinxokzjo", "hyqsovpivpnacwqtbfbs", "rpvaznwcgqgyvgyjlply",
				"bcezouxbqwgwdgyjwxto", "yujmygoxepqwulfzjurc", "yfefcrgufdojhpwutxev", "dkozadxwrewdiytjzzep",
				"rxwunqujpkvekfnqgfkt", "xhujqkyuhrtluppilxww", "xkltginlencadkziczfo", "oqgsavlosrenxvwruuxz",
				"jnajypdiehkvhebmnhbl", "qlwhxgjumgjgzhaopdhu", "wbqhnrgewqphviicsqpa", "fgvmqozinonqirtbbztb",
				"xqmoxrjuugcbjjtjyywo", "epntnlywwobjlthiffsa", "brwlvoqqjbcxamhtqwee", "lyuokedjndmhermzczwf",
				"fjqydhekftwoobxkysew", "kxcaamqcwqywhsslgcus", "brzwhjjvnjuuyblzbnxg", "kkczhwjeejoqtcjbrcws",
				"uqkxwfkjgfpqntverunk", "pyeiovdsqyrqdebqrgbk", "zwfojvdohtqcappvfjxd", "uqpbxtsmyayogfemgqof",
				"eaeliflpnymslpthsftl", "vdmpmtlseomeksonkxit", "sqdlrrxsjtxniwvvbggg", "tanfyqljkeilvzzyaffj",
				"srlxfoovpqnyfrmzccaa", "zopwvbiligjaembcvoyj", "jrlkxjwprggtznkcudei", "gtyhihsxtvoybfmzzlle",
				"wsyauvtjpnsrtjxtvafv", "mutvkskyzrzbcxfbfzbu", "zpjhjylmqkfpdjloqzjq", "rjgjjnvmkrueygdfckle",
				"wdfzlgzsqwskoaflebtk", "lywtxzgumkjlwaljaepq", "hqabjmbeqtwrvocwexql", "fhkmikwujgjjmfbsrxww",
				"jfaqegcxgmrtqilztznn", "lmaxwkfrlcuxejkpjhoq", "jvooawakloxtosnzobbh", "jsgleuoeyfjodqbvfmzk",
				"jiakiupvddbcqbywnere", "qdsgvrlxvcmveirnobqv", "hqphnzhiihekonzwztwf", "xsonmjfxjxetimdblgyr",
				"dssvgwbqrgxlvnigjtxr", "oatkahouxzzrajbdtynr", "tffzaflazjnjilkqyevy", "pwqdzgiohztywzncdbkr",
				"uipcjdqjfemdestdmwba", "xcivvdmqrkpvivdulnmf", "pzkmpozialwsdctisfxh", "zsjakpsmlxhkzvdlmnjb",
				"aowdwuiuytqdotecqxbb", "deqqjxzwofwosljivrab", "hzskbvfjidutnzyswfzy", "theagkonfrgkuxiztujw",
				"eirvbsryqqpqoydebgdk", "lgzbccsmhpnjtvrxjumi", "krbztszuzxfbfbcymukv", "ibyhxcxhdxvoalxywshe",
				"wwwcxrweknepjltxkxhu", "qkodzwtbfllgfasswzek", "mpxvuklevouzlhtemwwe", "xtcifeoyeelsfbewxoun",
				"wvuemwukmelhvoxelztp", "yvhdsztsuktmllzcyydi", "vtevfhohybsmonfrzotv", "ygmzdnvvcrjpohuwcnwb",
				"izbddhrzbwsndrdaxtos", "lbelwlpkcdmueznghbry", "enlpebycsefsztskwvzx", "tylnzyllkzqdwjtavkur",
				"kmfupvdecvsqzhienbpr", "dpkfbectyyqfjgxutinf", "juexuwtnthgkgzoafrik", "nmpfmwovrnzhcjrzjllo",
				"umcodezjczcuhlclodhk", "gkjtliunecrjwpzrkgxd", "jiqartlnrwsrdfznsxcz", "kfzphzjizsjhuwforlja",
				"gqzglarpwjgnvpvylyyc", "lebznerlidbssyslvdtl", "qbpyceosstcghkqmlqes", "aivexscuetckfuxdfoeu",
				"rlwlcbpyeumzlkednghb", "yqqbalpopxjmhhkjjtbn", "dfdlghuoebiaokrakivf", "cyqusmgfprgmfaziglvs",
				"gpwcrylagylqygvpznvj", "vnzpmdgmywwvxncvokrg", "ojqayqirylcpvrpxinms", "dtivihgiawzduyaqbyae",
				"bofirvefbaeqxqppfnvc", "eshbbkeaxpjuozheqfgv", "blqxvdzjmyushvxpyfai", "alkrwjformxtqlwcsyss",
				"nxnifsocomaxssgtxumu", "arertdbvdpecjjznwjri", "bkeybepiqydgrqrqovds", "ssbzdndadrrhiwozbtxd",
				"lprcsnabqedqjwstudvl", "teansrhhpshzozlkaxxu", "evfevvggsuaqgtnvnqqa", "wubkwgffjxmhjjiskwrm",
				"posstmayegdmvtbulnbo", "afizutrveyldrjvqtixs", "ebfxepleycstzkzswnsv", "vxlfdigrszrurijqeqai",
				"opribsqhktfpjyrbkrmj", "mlpjrmmvzlctnppdyuda", "qusqprcuzcrmzuzzsgyk", "uafxoheutkinjktwgrgz",
				"sserwzsxcujbhpsprtmb", "uaqphlulivtonfeuducz", "onuvlwarpsqypywwuxkd", "igxqslrrvvjwdtggbnxs",
				"gbgvnkhrhzengvzgpiak", "udzmdlcocecjhlokhucz", "dznapsztrjugszzwlfoh", "mzwhuvlwxeleuotempvk",
				"tfbchbukshwxipywjmei", "pbtjstlhznglvpumspva", "quabpavvzhfvjddwowph", "kfcbxakddhhsnrnodepx",
				"rlevgxmknqebcjtpbkxx", "pefekvnvprcmsqzuihdb", "qgrmzuzkyrzqszpucusc", "zaiwauugytlkflorhqly",
				"tbiqospcbgfutrdqrhse", "vgasxspnzohwnynrsmfd", "scogtbbeirrupqdstqfh", "fajdobvwahpvdwpuzhqv",
				"wfqqwtntipwtqwffqudm", "oibyhydavsaxyvymrqab", "rrnljuirmlzbugztbous", "gkevhnngpbhvazgrgkzi" };
		System.out.println(numSpecialEquivGroups(t1));
		System.out.println(numSpecialEquivGroups(t2));
		System.out.println(numSpecialEquivGroups(t3));
		System.out.println(numSpecialEquivGroups(t4));
		System.out.println(numSpecialEquivGroups(t5));

	}

	public static int numSpecialEquivGroups(String[] A) {
		for (int i = 0; i < A.length; i++) {
			String temp = A[i];
			char[] even;
			char[] odd;
			if (temp.length() % 2 == 0) {
				even = new char[temp.length() / 2];
				odd = new char[temp.length() / 2];
			} else {
				even = new char[temp.length() / 2 + 1];
				odd = new char[temp.length() / 2];
			}
			int evenIndex = 0;
			int oddIndex = 0;
			for (int j = 0; j < temp.length(); j++) {
				if (j % 2 == 0) {
					even[evenIndex] = temp.charAt(j);
					evenIndex++;
				} else {
					odd[oddIndex] = temp.charAt(j);
					oddIndex++;
				}
			}
			Arrays.sort(even);
			Arrays.sort(odd);
			StringBuffer stringBuffer = new StringBuffer();
			for (int m = 0; m < even.length; m++) {
				stringBuffer.append(even[m]);
			}
			for (int n = 0; n < odd.length; n++) {
				stringBuffer.append(odd[n]);
			}
			A[i] = stringBuffer.toString();
		}
		Arrays.sort(A);
		int ret = 1;
		for (int k = 0; k < A.length - 1; k++) {
			if (!A[k].equals(A[k + 1])) {
				ret++;
			}
		}
		return ret;
	}

}

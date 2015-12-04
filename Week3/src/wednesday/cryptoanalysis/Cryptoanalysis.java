package wednesday.cryptoanalysis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import wednesday.cryptoanalysis.util.Histogram;
import wednesday.cryptoanalysis.util.InglishLettersStatistic;

public class Cryptoanalysis {
	public static void main(String[] args) {
		String text = "Ajb vnf guj luqv akjvojufq  . Sk qkkj egvfs Rkhfwu Lumemu'q akhhfjvq kj vnf ohifjbojc essoxew kg Dofck Ckqve , nfsf'q Ffsjejbk Tkssfq vk qnkr vnf ohifvukuq zkujc dkz nkr ov'q bkjf    Iv'q vnf qehf fxfsz quhhfs . Nk-kjf neq fxfs coxfj hf ejzvnojc kj e iwevf . Tnfz hebf hf akhifvf gks hz iweaf vnf xfsz hkhfjv I ckv ojvk vnf gosqv vfeh; vnev'q rnev vnfz veucnv hf ejb ov'ww df vnev rez ujvow I wfexf . Tnf nocnfs puewovz iwezfsq vnev akhf - ejb Dofck Ckqve oq puewovz - vnf csfevfs vnf akhifvovokj roww df ejb vnf dfvvfs ov'ww df gks vnf vfeh .Ajb gfes jkv ( ks , ewvfsjevoxfwz , bkj'v cfv vkk ftaovfb)  , Tkssfq neq jk iwejq vk vuam veow ejb suj ejb wfexf noq iezanfamq dfnojb .    I bkj'v nexf ejz iwejq vk hkxf erez socnv jkr .    Ig rf woqvfjfb vk eww vnf suhkusq rf'b nexf 50 iwezfsq . Nkr'q jkv vnf socnv vohf vk df vnojmojc edkuv Cnfwqfe . I'h qusf vnf awud oq rksmojc vk ohiskxf vnf vfeh , duv eww vnev hevvfsq socnv jkr oq vnf Wkswb Cui .Om , vnev dov edkuv vnf 50 iwezfsq hebf hf anuamwf .  Noaf kjf , Ffsjejbk .Nkr , oj ej obfew rkswb , rf rkuwb ifsneiq cfv vnfqf rksbq gskh Lumemu , rnkh rf'b womf vk dfakhf wfcfjbesz ev Cnfwqfe .  Buv rf bkj'v woxf oj ej obfew rkswb , ejb ojqvfeb rf cfv vnfqf rksbq gskh Tkssfq , rnkh rf'b womf vk dfakhf e wkjc-gksckvvfj hfhksz ev Cnfwqfe .  Aweq .Tnev dfojc qeob , qojaf ov'q deqoaewwz ej ohikqqodwf vk veqm vk sob kusqfwxfq kg vnf £100h gwki , ev wfeqv nf'q ckv vnf socnv evvovubf .  Hussez?";
		// String text = "Godzilla";
		Map<Character, Integer> m = Histogram.createHistogram(text);
		System.out.println(text);
		System.out.println(m);
		System.out.println(InglishLettersStatistic.LETTERS);
		String tex = "";
		List<Character> l = new ArrayList<>();
		for (Map.Entry<Character, Integer> entry : m.entrySet()) {
			l.add(entry.getKey());
		}
		System.out.println(l);
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			 if (Character.isLowerCase(letter) ) {
			 switch (letter) {
			 case 'a':
			 tex += 'c';
			 break;
			 case 'b':
			 tex += 'd';
			 break;
			 case 'c':
			 tex += 'g';
			 break;
			 case 'd':
			 tex += 'b';
			 break;
			 case 'e':
			 tex += 'a';
			 break;
			 case 'f':
			 tex += 'e';
			 break;
			 case 'g':
			 tex += 'f';
			 break;
			 case 'h':
			 tex += 'm';
			 break;
			 case 'i':
			 tex += 'p';
			 break;
			 case 'j':
			 tex += 'n';
			 break;
			 case 'k':
			 tex += 'o';
			 break;
			 case 'l':
			 tex += 'm';
			 break;
			 case 'm':
			 tex += 'k';
			 break;
			 case 'n':
			 tex += 'h';
			 break;
			 case 'o':
			 tex += 'i';
			 break;
			 case 'p':
			 tex += 'q';
			 break;
			 case 'q':
			 tex += 's';
			 break;
			 case 'r':
			 tex += 'w';
			 break;
			 case 's':
			 tex += 'r';
			 break;
			 case 't':
			 tex += 'j';
			 break;
			 case 'u':
			 tex += 'u';
			 break;
			 case 'v':
			 tex += 't';
			 break;
			 case 'w':
			 tex += 'l';
			 break;
			 case 'x':
			 tex += 'v';
			 break;
			 case 'y':
			 tex += 'z';
			 break;
			 case 'z':
			 tex += 'y';
			 break;
			
			 default:
			 break;
			 }
			 }
			 if (Character.isUpperCase(letter) ||
			 Character.isWhitespace(letter)) {
			
			 tex += letter;
			 }
//			if (Character.isLetter(letter) && Character.isLowerCase(letter)
//					&& l.contains(letter) && letter != 'u' && letter != 'f'
//					&& letter != 'v') {
//				// System.out.println(letter);
//				int pos = l.indexOf(letter);
//				// System.out.println(pos);
//				System.out.print(InglishLettersStatistic.LETTERS[pos]);
//				continue;
//			}else {
//				int pos = l.indexOf(letter)+1;
//				// System.out.println(pos);
//				System.out.print(InglishLettersStatistic.LETTERS[pos]);
//			}
//			System.out.print(letter);
		}
		System.out.print(tex);
	}
}

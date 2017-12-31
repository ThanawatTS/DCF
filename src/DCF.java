import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class DCF {
	static String[] Agriculture = {"CHOTI", "EE", "GFPT", "LEE", "STA", "TLUXE", "TRUBB", "TWPC", "UPOIC", "UVAN", "VPO"};
	static String[] FoodAndDrink = {"APURE", "ASIAN", "BR", "BRR", "CBG", "CFRESH", "CM", "CPF", "CPI", "F&D", "HTC", "ICHI", "KBS", "KSL", "KTIS", "LST", "M", "MALEE", "MINT", "OISHI", "PB", "PM", "PRG", "SAPPE", "SAUCE", "SFP", "SNP", "SORKON", "SSC", "SSF", "SST", "TC", "TFG", "TIPCO", "TKN", "TU", "TVO"};
	static String[] Fashion = {"AFC", "BTNC", "CPH", "CPL", "ICC", "LTX", "NC", "PAF", "PG", "PRANDA", "SABINA", "SAWANG", "SUC", "TNL", "TPCORP", "TR", "TTI", "TTL", "TTTM", "UPF", "UT", "WACOAL"};
	static String[] Office = {"ACC", "AJA", "DTCI", "FANCY", "KYE", "L&E", "MODERN", "OGC", "ROCK", "SIAM", "TSR"};
	static String[] MedicalSupplies = {"DDD", "JCT", "OCC", "S & j", "STHAI", "TNR", "TOG"};
	static String[] Bank = {"BAY", "BBL", "CIMBT", "KBANK", "KKP", "KTB", "LHBANK", "SCB", "TCAP", "TISCO", "TMB"};
	static String[] Fund = {"AEC", "AEONTS", "AMANAH", "ASAP", "ASK", "ASP", "BFIT", "CGH", "CNS", "ECL", "FNS", "FSS", "GBX", "GL", "IFS", "JMT", "KCAR", "KGI", "KTC", "MBKET", "MFC", "ML", "MTLS", "PE", "PL", "S11", "SAWAD", "THANI", "TK", "TNITY", "UOBKH", "ZMICO"};
	static String[] Insurance = {"AYUD", "BKI", "BLA", "BUI", "CHARAN", "INSURE", "MTI", "NKI", "NSI", "SMK", "THRE", "THREL", "TIC", "TIP", "TSI", "TVI"};
	static String[] Vehi = {"AH", "APCS","BAT-3K", "CWT", "EASON", "GYT", "HFT", "IHL", "IRC", "PCSGH", "SAT", "SPG", "STANLY", "TKT", "TNPC", "TRU", "TSC", "YNP"};
	static String[] FacAndMach = {"ALLA", "ASEFA", "CRANE", "CTW", "FMT", "KKC", "PK", "SNC", "TCJ", "VARO"};
	static String[] PaperAndPrint = {"UTP"};
	static String[] PitoAndChemi = {"GC", "GGC", "GIFT", "IVL", "PATO", "PMTA", "PTTGC", "SUTHA", "TCB", "TCCC", "TPA", "UP", "VNT", "WG", "YCI" };
	static String[] Container = {"AJ", "ALUCON", "CSC", "NEP", "NPP", "PTL", "SITHAI", "SLP", "SMPC", "SPACK", "TCOAT", "TFI", "THIP", "TMD", "TOPP","TPBI","TPP"};
	static String[] Steel = {"AMC", "BSBM", "CEN", "CITY", "CSP", "GJS", "GSTEL", "INOX", "LHK", "MAX", "MCS", "MILL", "PAP", "PERM", "RICH", "SAM", "SMIT", "SSI", "SSSC", "TGPRO", "THE", "TIW", "TMT", "TSTH", "TUCC", "TWP", "TYCN"};
	static String[] ConstructionMaterial = {"CCP", "DCC", "DCON", "DRT", "EPG", "GEL", "PPP", "Q-CON", "RCI", "SCC", "SCCC", "SCP", "TASCO", "TCMC", "TGCI", "TPIPL", "UMI", "VNG", "WIIK"};
	static String[] Estate = {"A", "AMATA", "AMATAV", "ANAN", "AP", "APEX", "AQ", "BLAND", "BROCK", "CGD", "CI", "CPN", "ESTAR", "EVER", "GLAND", "GOLD", "J", "KC", "KWG", "LALIN", "LH", "LPN", "MBK", "MJD", "MK", "NCH", "NNCL", "NOBLE", "NUSA", "ORI", "PACE", "PF", "PLAT", "POLAR", "PRECHA", "PRIN", "PRINC", "PSH", "QH", "RICHY", "RML", "ROJNA", "S", "SAMCO", "SC", "SENA", "SF", "SIRI", "SPALI", "TFD", "TICON", "U", "UV", "WHA", "WIN"};
	static String[] CoEstate = {"AMATAR", "BKKCP", "CPNCG", "CPNREIT", "CPTGF", "CRYSTAL", "CTARAF", "DREIT", "ERWPF", "FUTUREPF", "GLANDRT", "GOLDPF", "GVREIT", "HPF", "HREIT", "IMPACT", "JCP", "KPNPF", "LHHOTEL", "LHPF", "LHSC", "LUXF", "M-II", "M-PAT", "M-STOR", "MIPF", "MIT", "MJLF", "MNIT", "MNIT2", "MNRF", "MONTRI", "POPF", "PPF", "QHHR", "QHOP", "QHPF", "SBPF", "SIRIP", "SPF", "SRIPANWA", "SSPF", "SSTPF", "SSTRT","TIF1", "TLGF", "TLHPF", "TNPF", "TPRIME", "TREIT", "TTLPF", "TU-PF", "URBNPF", "WHABT", "WHART"};
	static String[] Constructors = {"BJCHI", "CK", "CNT", "EMC", "ITD", "NWR", "PAE", "PLE", "PREB", "PYLON", "SEAFCO", "SQ", "SRICHA", "STEC", "STPI", "SYNTEC", "TPOLY", "TRC", "TTCL", "UNIQ"};
	static String[] EnergyAndCus = {"ABPIF", "AI", "AKR", "BAFS", "BANPU", "BCP", "BCPG", "BPP", "CKP", "DEMCO", "EA", "EARTH", "EASTW", "EGATIF", "EGCO", "ESSO", "GLOW", "GPSC", "GUNKUL", "IEC", "IFEC", "IRPC", "LANNA", "MDX", "PTG", "PTT" ,"PTTEP", "RATCH", "RPC", "SCG", "SCI", "SCN", "SGP", "SOLAR", "SPCG", "SUPER", "SUSCO", "TAE", "TCC", "TOP", "TPIPP", "TTW", "WHAUP" };
	static String[] Mineral = {"PDI", "THL"};
	static String[] Commercial = {"BEAUTY", "BIG", "BJC", "COL", "COM7", "CPALL", "CSS", "FN", "GLOBAL", "HMPRO", "IT", "KAMART", "LOXLEY", "MAKRO", "MC", "MEGA", "MIDA", "ROBINS", "SINGER", "SPC", "SPI"};
	static String[] Medical = {"AHC", "BCH" ,"BDMS" ,"BH", "CHG", "CMR", "EKH", "KDH", "LPH", "M-CHAI" ,"NEW", "NTV", "RAM", "RJH", "RPH", "SKR", "SVH", "VIBHA", "VIH"};
	static String[] MediaAndPrint = {"AMARIN", "AQUA", "AS", "BEC", "EPCO", "FE", "GRAMMY", "MACO", "MAJOR", "MATCH", "MATI", "MCOT", "MONO", "MPIC", "NMG", "PLANB", "POST", "PRAKIT", "RS", "SE-ED", "SMM", "SPORT", "TBSP", "TH", "TKS", "TRITN", "VGI", "WAVE" ,"WORK"};
	static String[] Service = {"BWG", "GENCO", "PRO"};
	static String[] TravleAndRecreation = {"ASIA", "CENTEL", "CSR", "DTC", "ERW", "GRAND", "GREEN", "LRH", "MANRIN", "OHTL", "ROH", "SHANG"};
	static String[] Logistic = {"AAV", "AOT", "ASIMAR", "BA", "BEM", "BTC", "BTS", "BTSGIF", "JUTHA", "JWD", "KWC", "NOK", "NYT", "PSL", "RCL", "THAI", "TSTE", "TTA", "WICE"};
	static String[] Electronic = {"CCET", "DELTA", "EIC", "HANA", "KCE", "METCO", "SMT", "SPPT", "SVI", "TEAM"};
	static String[] TechnologyAndMedia = {"ADVANC", "AIT", "ALT", "BLISS", "CSL", "DIF", "DTAC", "FER", "FORTH", "ILINK", "INET", "INTUCH", "JAS", "JASIF", "JMART", "JTS", "MFEC", "MSC", "PT", "SAMART", "SAMTEL", "SDC", "SIS", "SVOA", "SYMC", "SYNEX", "THCOM", "TRUE", "TWZ"};

	static String website="";
	static String All="",namecompany="";
	static int countstock = 0;
	static int countpfofstock = 0, countprice=0;
	static int indexcompany=0,Industry=0;
	static int skipPf=0,skipPri=0;
	static ArrayList<String> names;

	public static void index(){
		//-----------1----------------------
		if(Industry == 0){
			if(indexcompany < Agriculture.length){
				namecompany = Agriculture[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		//------------2----------------------
		else if (Industry == 1){
			if(indexcompany < FoodAndDrink.length){
				namecompany = FoodAndDrink[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 2){
			if(indexcompany < Fashion.length){
				namecompany = Fashion[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 3){
			if(indexcompany < Office.length){
				namecompany = Office[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 4){
			if(indexcompany < MedicalSupplies.length){
				namecompany = MedicalSupplies[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 5){
			if(indexcompany < Bank.length){
				namecompany = Bank[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 6){
			if(indexcompany < Fund.length){
				namecompany = Fund[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 7){
			if(indexcompany < Insurance.length){
				namecompany = Insurance[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 8){
			if(indexcompany < Vehi.length){
				namecompany = Vehi[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 9){
			if(indexcompany < FacAndMach.length){
				namecompany = FacAndMach[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 10){
			if(indexcompany < PaperAndPrint.length){
				namecompany = PaperAndPrint[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 11){
			if(indexcompany < PitoAndChemi.length){
				namecompany = PitoAndChemi[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 12){
			if(indexcompany < Container.length){
				namecompany = Container[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 13){
			if(indexcompany < Steel.length){
				namecompany = Steel[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 14){
			if(indexcompany < ConstructionMaterial.length){
				namecompany = ConstructionMaterial[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 15){
			if(indexcompany < Estate.length){
				namecompany = Estate[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 16){
			if(indexcompany < CoEstate.length){
				namecompany = CoEstate[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 17){
			if(indexcompany < Constructors.length){
				namecompany = Constructors[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 18){
			if(indexcompany < EnergyAndCus.length){
				namecompany = EnergyAndCus[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 19){
			if(indexcompany < Mineral.length){
				namecompany = Mineral[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 20){
			if(indexcompany < Commercial.length){
				namecompany = Commercial[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 21){
			if(indexcompany < Medical.length){
				namecompany = Medical[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 22){
			if(indexcompany < MediaAndPrint.length){
				namecompany = MediaAndPrint[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 23){
			if(indexcompany < Service.length){
				namecompany = Service[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 24){
			if(indexcompany < TravleAndRecreation.length){
				namecompany = TravleAndRecreation[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 25){
			if(indexcompany < Logistic.length){
				namecompany = Logistic[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 26){
			if(indexcompany < Electronic.length){
				namecompany = Electronic[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}
		else if (Industry == 27){
			if(indexcompany < TechnologyAndMedia.length){
				namecompany = TechnologyAndMedia[indexcompany];
			}
			else{
				indexcompany = 0;
			}
		}


		indexcompany++;
	}

	public static void NumberofStock(){

		website = "https://www.set.or.th/set/companyprofile.do?symbol="+namecompany+"&ssoPageId=4&language=th&country=TH";

		try {
			Document doc = Jsoup.connect(website).userAgent("mozilla/17.0").get();
			Elements temp = doc.select("div.table-reponsive");

			System.out.print(namecompany+": ");
			for(Element ele:temp){

				//System.out.println(" "+ ele.getAllElements().first().text() );

				names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));


			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//---------------------------------------�ӹǹ���
		//---------------------------------------�ӹǹ���
		//---------------------------------------�ӹǹ���
		if(namecompany.equals("F&D")||namecompany.equals("L&E")||namecompany.equals("S & j")){
			System.out.print("�Դ��ͼԴ��Ҵ㹡�ô֧������");
		}

		else{
			for(int i = 0 ; i < names.size() ; i++){
				if(names.get(i).equals("�ӹǹ��鹨�����¹�Ѻ�ŷ.")){
					countstock = i+1;
					System.out.print("�ӹǹ���"+" ");
					break;
				}
			}
			System.out.print(names.get(countstock)+" ");
		}

		//---------------------------------------�ӹǹ���
		//---------------------------------------�ӹǹ���
		//---------------------------------------�ӹǹ���

	}

	public static void PfandPrice(){


		website = "https://www.set.or.th/set/companyhighlight.do?symbol="+namecompany+"&ssoPageId=5&language=th&country=TH";

		try {
			Document doc = Jsoup.connect(website).userAgent("mozilla/17.0").get();
			Elements temp = doc.select("table.table-info");
			for(Element ele:temp){
				//System.out.println(" "+ ele.getAllElements().first().text() );
				names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		//--------------------------���õ�����----------------------
		//--------------------------���õ�����----------------------
		if(namecompany.equals("F&D")||namecompany.equals("L&E")||namecompany.equals("S & j")){

		}
		else{
			for(int i = 0 ; i < names.size() ; i++){
				if(names.get(i).equals("���õ�����")){
					countpfofstock = i+2;
					System.out.print("���õ�����"+" ");
					break;
				}
			}
			for(int i = 0 ; i < 5 ; i++){
				if(skipPf != 0){
					System.out.print("-"+" ");
				}
				else if(skipPf == 0 && names.get(countpfofstock+i).contains("0") || names.get(countpfofstock+i).contains("1") || names.get(countpfofstock+i).contains("2") || names.get(countpfofstock+i).contains("3") || names.get(countpfofstock+i).contains("4") || names.get(countpfofstock+i).contains("5") || names.get(countpfofstock+i).contains("6") || names.get(countpfofstock+i).contains("7") || names.get(countpfofstock+i).contains("8") || names.get(countpfofstock+i).contains("9")){
					System.out.print(names.get(countpfofstock+i)+" ");
				}
				else{
					System.out.print("-"+" ");
					skipPf++;
				}
			}
		}

		//--------------------------�Ҥ�����ش----------------------
		//--------------------------�Ҥ�����ش----------------------
		if(namecompany.equals("F&D")||namecompany.equals("L&E")||namecompany.equals("S & j")){

		}
		else{
			for(int i = 0 ; i < names.size() ; i++){
				if(names.get(i).equals("�Ҥ�����ش(�ҷ)")){
					countprice = i+1;
					System.out.print("�Ҥ�����ش"+" ");
					break;
				}
			}
			for(int i = 0 ; i < 5 ; i++){
				if(skipPri != 0){
					System.out.print("-"+" ");
				}
				else if(skipPri == 0 && names.get(countprice+i).contains("0") || names.get(countprice+i).contains("1") || names.get(countprice+i).contains("2") || names.get(countprice+i).contains("3") || names.get(countprice+i).contains("4") || names.get(countprice+i).contains("5") || names.get(countprice+i).contains("6") || names.get(countprice+i).contains("7") || names.get(countprice+i).contains("8") || names.get(countprice+i).contains("9")){
					System.out.print(names.get(countprice+i)+" ");
				}
				else{
					System.out.print("-"+" ");
					skipPri++;
				}
			}
		}

	}
	public static void Run(){
		System.out.println("�ɵ�����ص��ˡ�������� >> ��áԨ����ɵ�");
		for(int i = 0 ; i < Agriculture.length ; i++){
			index();
			NumberofStock();
			PfandPrice();
			System.out.println();
			skipPri=0;
			skipPf=0;
		}
		indexcompany=0;
		Industry++;
		System.out.println();
		//--------
		//--------
		System.out.println("�ɵ�����ص��ˡ�������� >> ������������ͧ����");
		for(int i = 0 ; i < FoodAndDrink.length ; i++){
			index();
			NumberofStock();
			PfandPrice();
			System.out.println();
			skipPri=0;
			skipPf=0;
		}
		indexcompany=0;
		Industry++;
		System.out.println();
		//---------
		//---------
		System.out.println("�Թ����ػ��������� >> Ὺ��");
		for(int i = 0 ; i < Fashion.length ; i++){
			index();
			NumberofStock();
			PfandPrice();
			System.out.println();
			skipPri=0;
			skipPf=0;
		}
		indexcompany=0;
		Industry++;
		System.out.println();
		//---------
		//---------
		System.out.println("�Թ����ػ��������� >> �ͧ��㹤������͹����ӹѡ�ҹ");
		for(int i = 0 ; i < Office.length ; i++){
			index();
			NumberofStock();
			PfandPrice();
			System.out.println();
			skipPri=0;
			skipPf=0;
		}
		indexcompany=0;
		Industry++;
		System.out.println();
		//---------
		//---------
		System.out.println("�Թ����ػ��������� >> �ͧ����ǹ�������Ǫ�ѳ��");
		for(int i = 0 ; i < MedicalSupplies.length ; i++){
			index();
			NumberofStock();
			PfandPrice();
			System.out.println();
			skipPri=0;
			skipPf=0;
		}
		indexcompany=0;
		Industry++;
		System.out.println();
		//---------
		//---------
		System.out.println("��áԨ����Թ >> ��Ҥ��");
		for(int i = 0 ; i < Bank.length ; i++){
			index();
			NumberofStock();
			PfandPrice();
			System.out.println();
			skipPri=0;
			skipPf=0;
		}
		indexcompany=0;
		Industry++;
		System.out.println();
		//---------
		//---------
		System.out.println("��áԨ����Թ >> �Թ�ع�����ѡ��Ѿ��");
		for(int i = 0 ; i < Fund.length ; i++){
			index();
			NumberofStock();
			PfandPrice();
			System.out.println();
			skipPri=0;
			skipPf=0;
		}
		indexcompany=0;
		Industry++;
		System.out.println();
		//---------
		//---------
		System.out.println("��áԨ����Թ >> ��Сѹ�����л�Сѹ���Ե");
		for(int i = 0 ; i < Insurance.length ; i++){
			index();
			NumberofStock();
			PfandPrice();
			System.out.println();
			skipPri=0;
			skipPf=0;
		}
		indexcompany=0;
		Industry++;
		System.out.println();
		//---------
		//---------
		System.out.println("�Թ����ص��ˡ��� >> �ҹ¹��");
		for(int i = 0 ; i < Vehi.length ; i++){
			index();
			NumberofStock();
			PfandPrice();
			System.out.println();
			skipPri=0;
			skipPf=0;
		}
		indexcompany=0;
		Industry++;
		System.out.println();
		//---------
				//---------
				System.out.println("�Թ����ص��ˡ��� >> ��ʴ��ص��ˡ����������ͧ�ѡ�");
				for(int i = 0 ; i < FacAndMach.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();
				//---------
				//---------
				System.out.println("�Թ����ص��ˡ��� >> ��д�������ʴء�þ����");
				for(int i = 0 ; i < PaperAndPrint.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();
				//---------
				//---------
				System.out.println("�Թ����ص��ˡ��� >> ��������������ѳ��");
				for(int i = 0 ; i < PitoAndChemi.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();
				//---------
				//---------
				System.out.println("�Թ����ص��ˡ��� >> ��è��ѳ��");
				for(int i = 0 ; i < Container.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();
				//---------
				//---------
				System.out.println("�Թ����ص��ˡ��� >> ����");
				for(int i = 0 ; i < Steel.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();
				//---------
				//---------
				System.out.println("��ѧ�������Ѿ����С�����ҧ >> ��ʴء�����ҧ");
				for(int i = 0 ; i < ConstructionMaterial.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();
				//---------
				//---------
				System.out.println("��ѧ�������Ѿ����С�����ҧ >> �Ѳ����ѧ�������Ѿ��");
				for(int i = 0 ; i < Estate.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();
				//---------
				//---------
				System.out.println("��ѧ�������Ѿ����С�����ҧ >> �ͧ�ع�����ѧ�������Ѿ����Сͧ���ʵ����͡��ŧ�ع���ѧ�������Ѿ��");
				for(int i = 0 ; i < CoEstate.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();
				//---------
				//---------
				System.out.println("��ѧ�������Ѿ����С�����ҧ >> ��ԡ���Ѻ���ҡ�����ҧ");
				for(int i = 0 ; i < Constructors.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();
				//---------
				//---------
				System.out.println("��Ѿ�ҡ� >> ��ѧ�ҹ����Ҹ�óٻ���");
				for(int i = 0 ; i < EnergyAndCus.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();
				//---------
				//---------
				System.out.println("��Ѿ�ҡ� >> ����ͧ���");
				for(int i = 0 ; i < Mineral.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();
				//---------
				//---------
				System.out.println("��ԡ�� >> �ҳԪ��");
				for(int i = 0 ; i < Commercial.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();
				//---------
				//---------
				System.out.println("��ԡ�� >> ���ᾷ��");
				for(int i = 0 ; i < Medical.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();
				//---------
				//---------
				System.out.println("��ԡ�� >> ���������觾����");
				for(int i = 0 ; i < MediaAndPrint.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();
				//---------
				//---------
				System.out.println("��ԡ�� >> ��ԡ��੾�СԨ");
				for(int i = 0 ; i < Service.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();
				//---------
				//---------
				System.out.println("��ԡ�� >> ��÷�ͧ���������ѹ��ҡ��");
				for(int i = 0 ; i < TravleAndRecreation.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();
				//---------
				//---------
				System.out.println("��ԡ�� >> ��������Ũ�ʵԡ��");
				for(int i = 0 ; i < Logistic.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();
				//---------
				//---------
				System.out.println("෤����� >> �����ǹ����硷�͹ԡ��");
				for(int i = 0 ; i < Electronic.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();
				//---------
				//---------
				System.out.println("෤����� >> ෤��������ʹ����С���������");
				for(int i = 0 ; i < TechnologyAndMedia.length ; i++){
					index();
					NumberofStock();
					PfandPrice();
					System.out.println();
					skipPri=0;
					skipPf=0;
				}
				indexcompany=0;
				Industry++;
				System.out.println();



	}
	//------------------
	//------------------
	public static void main (String[] args){

		Run();


	}

}

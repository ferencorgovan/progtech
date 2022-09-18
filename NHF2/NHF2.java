public class NHF2 {
	public static void main(String[] args) {
		String lang = args.length>1?args[1]:"hun";
		 
		switch (lang) {
			case "hun":
				System.out.print("Szia, " + args[0]);
				break;
			case "eng":
				System.out.print("Hello, " + args[0]);
				break;
			case "haw":
				System.out.print("Aloha, " + args[0]);
				break;
			default:
				System.out.println("Ismeretlen nyelv");
				break;
		}
		
	}
}
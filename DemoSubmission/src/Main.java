import java.util.Arrays;
import java.util.List;

import ac.il.afeka.fsm.DFSM;
import ac.il.afeka.fsm.NDFSM;
import ac.il.afeka.Submission.Submission;



public class Main implements Submission, Assignment3 {
	public static void main(String[] arg) throws Exception{
		Main myprog = new Main();
		System.out.println("NDFSM");
		System.out.println(myprog.convert("1 2 3 4 5 6 7 8/a b c/1,b,1;1,,2;2,b,3;2,b,5;2,,7;3,a,4;3,c,4;4,c,2;4,c,7;5,a,6;5,b,6;6,c,2;6,c,7;6,,2;7,b,8/1/8"));
		System.out.println(myprog.convert("1 2 3 4/a b/1,a,1;1,b,1;1,a,2;2,a,3;2,b,3;3,a,4;3,b,4/1/4"));
		System.out.println(myprog.convert("0/a/0,,0/0/"));
		System.out.println(myprog.convert("1 2/0 1/1,0,1;1,1,2;2,0,2;2,1,1/1/2"));
		System.out.println(myprog.convert("0/a/0,,0;0,a,0/0/0"));
		System.out.println(myprog.convert("0 1/a/0,a,1;1,a,1/0/"));
		System.out.println("DFSM");
		System.out.println(new DFSM("1 2 3 4 5 6 7 8 9 10/a b c/1,a,10;1,c,10;1,b,2;2,a,5;2,b,3;2,c,4;3,a,5;3,b,3;3,c,9;4,a,10;4,b,10;4,c,7;5,a,10;5,b,6;5,c,7;6,a,5;6,b,8;6,c,4;7,a,10;7,b,6;7,c,10;8,a,10;8,b,6;8,c,7;9,a,10;9,b,6;9,c,7;10,a,10;10,b,10;10,c,10/1/3 2 6").minimize().toCanonicForm().encode());
		System.out.println(new DFSM("0 1 2 3 4 5 6 7/a b/3,b,7; 0,a,1;7,a,1; 3,a,6; 7,b,0; 4,b,5; 2,b,5;1,b,3; 0,b,0; 1,a,2; 2,a,4; 4,a,4;5,b,7; 5,a,6; 6,a,2; 6,b,3/0/4 5 6 7").minimize().toCanonicForm().encode());
		System.out.println(new DFSM("0 1/a/0,a,1;1,a,1/0/").minimize().toCanonicForm().encode());
		System.out.println(new DFSM("1 2/0 1/1,0,1;1,1,2;2,0,2;2,1,1/1/2").minimize().toCanonicForm().encode());
		System.out.println(new DFSM("0/a/0,a,0/0/0").minimize().toCanonicForm().encode());
		System.out.println(new DFSM("0 1/a/0,a,1;1,a,1/0/").minimize().toCanonicForm().encode());
		
	}

	@Override
	public List<String> submittingStudentIds() {
		return Arrays.asList("336228317", "209151380");
	}

	@Override
	public  String convert(String ndfsm) throws Exception {
		return new NDFSM(ndfsm).toDFSM().minimize().toCanonicForm().encode();
	}

}

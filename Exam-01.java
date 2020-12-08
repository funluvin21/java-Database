//http://blog.naver.com/PostView.nhn?blogId=munjh4200&logNo=50176968113

PreparedStatement ps = null; //동적 쿼리를 이용해 보기
ResultSet re = null;   //데이터 주소값 이용하기 위함.
String sql = "select * from friend";

try{
    ps = con.prepareStatement(sql);
    rs = ps.executeQuery();  //쿼리문이 select로 시작되면 무조건
    System.out.println("이름 \t 전화번호 \t 주소");
    
    while(rs.next()){
        String name = rs.getString("name"); //name 필드의 데이터
        String tel = rs.getString(2); //두번째 필드의 데이터
        String address = rs.getString(3); // 세번째 필드의 데이터
        System.out.println(name+"\t"+tel+"\t"+address);
    }
catch(SQLException e){
    e.printStackTrace();
}

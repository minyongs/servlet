package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    //싱글톤으로 만듬
    //인스턴스가 딱 하나만 생성되고 인스턴스를 어디서든 접근할 수 있음
    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance(){
        return instance;
    }
    private MemberRepository(){

    }

    public Member save(Member member){
        member.setId(sequence++);
        store.put(member.getId(),member);
        return member;
    }

    public Member findByid(Long id){
        return store.get(id);
    }

    public List<Member> findAll(){
        return new ArrayList<>(store.values());

    }

    public void clearStore(){
        store.clear();
    }
}

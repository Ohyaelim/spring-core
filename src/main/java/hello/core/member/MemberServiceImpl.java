package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    /*
    * private final MemberRepository memberRepository 이것만 하면 구현이 안돼.
    * 인터페이스일 뿐이니까. 그래서 미리 만들어놓은 임의의 구현체 MemoryMemberRepository 로 new 해주자
    */

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    //test 용
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}

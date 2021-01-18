package hello.core.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
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
}

package hello.core.scan.filter;

import java.lang.annotation.*;

//컴포넌트에 넣는다.
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}

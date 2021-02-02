package hello.core.scan.filter;

import java.lang.annotation.*;

//컴포넌트에 제외한다
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
}

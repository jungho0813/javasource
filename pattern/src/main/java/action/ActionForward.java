package action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class ActionForward {
	// return 페이지 이동방식(true,false),페이지(String);
	private boolean isRedirect;
	private String path;
}

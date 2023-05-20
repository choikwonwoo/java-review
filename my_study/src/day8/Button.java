package day8;

public class Button {
	OnClickListener onClickListener;
	
	void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	
	void touch() {
		onClickListener.OnClick();
	}
	
	interface OnClickListener{
		void OnClick();
	};
}

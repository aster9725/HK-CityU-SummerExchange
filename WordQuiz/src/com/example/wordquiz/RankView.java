package com.example.wordquiz;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.Display;
import android.view.View;

public class RankView extends View {

	int w;
	int h;
	Paint paint;
	Typeface tf;

	public RankView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		setBackgroundResource(R.drawable.res_recordback);
		tf = Typeface.createFromAsset(context.getAssets(), "fonts/crayon.ttf");

		paint = new Paint();
		paint.setColor(Color.WHITE);
		paint.setStrokeWidth(2);
		paint.setTypeface(tf);
		paint.setTextSize(80);
		
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub

		int width = 5 * w / 6 - w / 6;
		int height = 2 * h / 3 - h / 3;
		
		//setBtnRect();

		canvas.drawLine(w / 6, h / 3, 5 * w / 6, h / 3, paint);
		canvas.drawLine(w / 6, h / 2, 5 * w / 6, h / 2, paint);
		canvas.drawLine(w / 6, 2 * h / 3, 5 * w / 6, 2 * h / 3, paint);

		canvas.drawText("PAST", w / 6 - 40, 2 * h / 3 + 75, paint);
		canvas.drawText("NOW", 4 * w / 6 + 20, 2 * h / 3 + 75, paint);
		
		paint.setTextSize(35);
		canvas.drawText(" 0", w / 6 - 40, 2 * h / 3 + 15, paint);
		canvas.drawText("15", w / 6 - 40, h / 2 + 15, paint);
		canvas.drawText("30", w / 6 - 40, h / 3 + 15, paint);

		paint.setStyle(Paint.Style.FILL);
		paint.setColor(0xff92D050);

		for (int i = 1, j = 0; i < 10; i += 2, j++) {
			canvas.drawRoundRect(new RectF(w / 6 + width / 11 * i, 2 * h / 3
					- height * MainActivity.prefVal[j] / 30, w / 6 + width / 11
					* (i + 1), 2 * h / 3), 10, 10, paint);
		}
		
		super.onDraw(canvas);
	}

	@Override
	public void onSizeChanged(int w, int h, int oldw, int oldh) {
		super.onSizeChanged(w, h, oldw, oldh);
		this.w = w;
		this.h = h;
	}

}

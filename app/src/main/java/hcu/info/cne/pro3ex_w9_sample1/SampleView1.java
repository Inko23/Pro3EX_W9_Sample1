package hcu.info.cne.pro3ex_w9_sample1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class SampleView1 extends View {
    private Paint paint;

    public int [][] mtrx =
            {
                    {0, 1, 0, 0, 0, 0, 1, 0,},
                    {1, 0, 0, 0, 0, 0, 0, 1,},
                    {0, 0, 0, 0, 0, 0, 0, 0,},
                    {0, 0, 0, 0, 0, 0, 0, 0,},
                    {0, 0, 0, 0, 0, 0, 0, 0,},
                    {0, 0, 0, 0, 0, 1, 1, 1,},
                    {1, 0, 0, 0, 0, 1, 0, 0,},
                    {0, 1, 0, 0, 0, 0, 1, 0,},
            };

    public SampleView1(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i,j;

        // 背景、半透明
        canvas.drawColor(Color.argb(125, 0, 0, 255));

        // 矩形
        paint.setColor(Color.argb(255, 255, 0, 255));
        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.STROKE);
        for(i = 0; i < 8; i++){
            for(j = 0; j < 8; j++){
                if(mtrx[j][i] == 1) {
                    // (x1,y1,x2,y2,paint) 左上の座標(x1,y1), 右下の座標(x2,y2)
                    canvas.drawRect(0 + 50 * i, 0 + 50 * j, 50 + 50 * i, 50 + 50 * j, paint);
                }
            }
        }

    }
}



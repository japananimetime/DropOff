package com.example.hikaro.simplepaint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Hikaro on 14.11.2016.
 */
public class Draw2D extends View {
    public Draw2D(MainActivity context) {
        super(context);
    }


    private Paint mPaint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // стиль Заливка
        mPaint.setStyle(Paint.Style.FILL);
        //Переменные для движения, ширина линий, координаты мяча
        float firstLineWidth = (float)(canvas.getWidth()/1.65);
        float secondLineWidth=canvas.getWidth()-firstLineWidth-110;
        float linesHeight=(float)(canvas.getHeight()/1.5);
        // закрашиваем холст белым цветом
        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.BLACK);
        canvas.drawCircle(canvas.getWidth()/2, 75, 50, mPaint);
        canvas.drawLine(0, linesHeight, firstLineWidth, linesHeight, mPaint);
        canvas.drawLine(canvas.getWidth(), linesHeight, canvas.getWidth() - secondLineWidth, linesHeight, mPaint);
        //linesHeight=linesHeight+1;
    }
}

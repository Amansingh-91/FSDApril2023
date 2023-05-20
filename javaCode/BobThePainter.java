package javaCode;

public class BobThePainter {
    public int getBucketCount(double width, double height, double areaPerBucket, int extraBucket){
        if(width <=0 || height <=0 || areaPerBucket <=0 || extraBucket < 0){
            return -1;
        }
        return (int)(width * height / areaPerBucket) - extraBucket;
    }
    public int getBucketCount(double width, double height, double areaPerBucket){
        if(width <=0 || height <=0 || areaPerBucket <=0 ){
            return -1;
        }
        return (int)(width * height / areaPerBucket);
    }

    public int getBucketCount(double areaOfWall, double areaPerBucket){
        if(areaOfWall <=0 || areaPerBucket <=0 ){
            return -1;
        }
        return (int)(areaOfWall / areaPerBucket);
    }

}

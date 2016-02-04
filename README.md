### Android ProgressImageView

[ ![Download](https://api.bintray.com/packages/ydcool/maven/ProgressImageView/images/download.svg) ](https://bintray.com/ydcool/maven/ProgressImageView/_latestVersion)

An iOS style progress ImageView.

#### Demo

![demo](art/piv.gif)

Demo apk [download](http://7xiilm.com1.z0.glb.clouddn.com/apk%2FProgressImageViewDemo.apk)

or scan ![demo](https://api.qrserver.com/v1/create-qr-code/?data=http://7xiilm.com1.z0.glb.clouddn.com/apk%2FProgressImageViewDemo.apk&size=120x120)

#### Install

gradle :

```java
    dependencies {
        compile 'me.ydcool.lib:progressimageview:latest.integration'
    }
```

#### Usage

in your layout xml:

```xml
<me.ydcool.lib.progressimageview.ProgressImageView
        android:id="@+id/Main_piv"
        android:layout_width="200dp"
        android:layout_height="200dp"
        android:src="@mipmap/ic_launcher"
        app:pi_mask_color="#CC233333"
        app:pi_progress="0"
        app:pi_radius="60dp"
        app:pi_stroke="6dp"/>
```

setter and getter:

```java
    //setter
    progressImageView.setProgress(yourProgress);
    
    //getter
    int currentProgress = progressImageView.getProgress();
```

#### Attributes

| attr | description |
| ---- | ----------- |
| `pi_mask_color` | mask color.argb will looks better. default is `Color.argb(180,0,0,0)` |
| `pi_progress` | the progress ,default is 0. |
| `pi_radius` | the radius of inner circle. default is 1/4 of the min side.|
| `pi_stroke` | stroke for the transparent ring.default is 8dp. |

#### TODO

* support for pause and resume

#### License

[Apache License 2.0](LICENSE)
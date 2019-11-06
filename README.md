# publicite-android-examples
Publicite Android SDK Integration

# Introduction 
The Cyberspace publicite SDK makes it easy to add a publicite ads engine to your android application.

# Getting Started
##	Installation

### Gradle
#### Add the following lines to your root build.gradle at the end of repositories
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

#### Add the dependency
```
dependencies {
	       implementation 'com.github.cyberspace-ltd:publicite-sdk-android:0.3.5'
	}
```

##	Usage
### Native Ads

![Publicite Native Ads](https://github.com/cyberspace-ltd/publicite-android-examples/raw/master/native_ads.png)

** See Example Folder **


### Banner Ads

![Publicite Native Ads](https://github.com/cyberspace-ltd/publicite-android-examples/raw/master/banner_ads.png)

#### Place PubliciteAdsView in a CoordinatorLayout layout
```
<com.cyberspace.publicite.android.sdk.ui.PubliciteAdsView
        android:id="@+id/nativeAdsView"
        android:layout_marginRight="10dp"
        android:layout_marginLeft="10dp"
        app:contentType="IMAGE"
        android:layout_gravity="bottom|center"
        app:refreshRateMs="100000"
        app:adsToken="YOUR PUBLICITE SPACE ID/TOKEN"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>

```

### Full Page Ads

![Publicite Native Ads](https://github.com/cyberspace-ltd/publicite-android-examples/raw/master/full_page_ads.png)

#### **Step 1:** Create instance of PubliciteFPAds
```
...

private PubliciteFPAds publiciteFPAds;

            ...
            publiciteFPAds= new PubliciteFPAds(/*context*/this);

           
            ...
    }
    
```

#### **Step 2** Initialise the PubliciteFPAds object and call .loadAds, passing your **PUBLICITE ADS TOKEN** and a refresh rate in milli seconds

```
            ...
             /*Load Ads with refresh rate in milli seconds set to 50 seconds*/
            publiciteFPAds.loadAds(/*adstoken*/"fpOtdSZU7KST3SyyenezshjVnmyVrHK8asUZBIls2T8%3D",/*refreshRateMs*/50000);

            ...


```
### Slider Ads

![Publicite Native Ads](https://github.com/cyberspace-ltd/publicite-android-examples/raw/master/slider_ads.png)

#### **Step 1** Add PubliciteSliderAdsView to anywhere in your layout as shown below.

```

        <com.cyberspace.publicite.android.sdk.ui.PubliciteSliderAdsView
                android:id="@+id/slider_ad"
                app:adsToken="Your Publicite Token"
                app:contentType="RANDOM"
                app:refreshRateMs="10000"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"/>

```

#### **Step 2** Initialise the PubliciteSliderAdsView in the onCreate method

```
        ...

          publiciteSliderAdsView = findViewById(R.id.slider_ad);
          publiciteSliderAdsView.loadAds();

        ...

```


import os

# Accessing variables.
kobiton_username = os.getenv('KOBITON_USERNAME')
kobiton_access_key = os.getenv('KOBITON_ACCESS_KEY')
device_name = os.getenv('DEVICE_NAME')
kobiton_app = os.getenv('KOBITON_APP')

print(os.environ)

kobitonServerUrl = 'https://{0}:{1}@api.kobiton.com/wd/hub'.format(kobiton_username, kobiton_access_key)
print(kobitonServerUrl)
# 100 seconds
session_timeout = 120

desired_caps_android_web = {
  'sessionName': '[Python] Android web',
  'sessionDescription': 'This is an example for Android web testing',
  'deviceOrientation':  'portrait',
  'browserName':        'chrome',
  'captureScreenshots': True,
  'deviceGroup':        'KOBITON',
  'deviceName':         'Galaxy S5',
  'platformName':       'Android',
  'newCommandTimeout':  120
}

desired_caps_android_app = {
  'sessionName': '[Python] Android app',
  'sessionDescription': 'This is an example for Android app testing',
  'deviceOrientation':  'portrait',
  'app':                kobiton_app or 'https://s3-ap-southeast-1.amazonaws.com/kobiton-devvn/apps-test/demo/iFixit.apk',
  'captureScreenshots': True,
  'deviceGroup':        'KOBITON',
  'deviceName':         device_name or '*',
  'platformName':       'Android',
  'newCommandTimeout':  120
}

desired_caps_ios_web = {
  'sessionName': '[Python] iOS web',
  'sessionDescription': 'This is an example for iOS web testing',
  'deviceOrientation':  'portrait',
  'browserName':        'safari', 
  'captureScreenshots': True,
  'deviceGroup':        'KOBITON',
  'deviceName':         'iPhone 7',
  'platformName':       'iOS',
  'newCommandTimeout':  120
}

desired_caps_ios_app = {
  'sessionName': '[Python] iOS app',
  'sessionDescription': 'This is an example for iOS app testing',
  'deviceOrientation':  'portrait',
  'app':                'https://s3-ap-southeast-1.amazonaws.com/kobiton-devvn/apps-test/demo/iFixit.ipa',
  'captureScreenshots': True,
  'deviceGroup':        'KOBITON',
  'deviceName':         'iPhone 7',
  'platformName':       'iOS',
  'newCommandTimeout':  120
}

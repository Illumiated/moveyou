Contributing to MoveYou Project
=========================================
![Travis](https://travis-ci.org/verwirrteswesen/moveyou.svg?branch=master)
![Codacy Badge](https://api.codacy.com/project/badge/Grade/eb6867d5738c4311af9d8cfc02693d41)
![Java](https://img.shields.io/badge/Java-8.0-red.svg)
![Bower version](https://badge.fury.io/bo/badges.svg)

![Java](https://img.shields.io/badge/Java-8.0-red.svg)
![Dropwizard](https://img.shields.io/badge/Dropwizard-1.2.0-orange.svg)
![maven](https://img.shields.io/badge/mvn-3.0.0-orange.svg)


![NPM](https://img.shields.io/badge/npm-5.4.2-green.svg)
![bower](https://img.shields.io/badge/bower-1.8.2-blue.svg)

![Semver](http://img.shields.io/SemVer/0.1.0.png)
![GitHub license](https://img.shields.io/badge/license-Original%20BSD-blue.svg)
![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)

MoveYou welcomes contributions to our [open source projects on Github](https://github.com/verwirrteswesen/moveyou).

Issues
------

Feel free to submit issues and enhancement requests.

Feel free to fix issues found in codacy https://www.codacy.com/app/verwirrteswesen/moveyou/issues


Contributing
------------

Please refer to each project's style guidelines and guidelines for submitting patches and additions. In general, we follow the "fork-and-pull" Git workflow.

 1. **Fork** the repo on GitHub
 2. **Clone** the project to your own machine
 3. **Test** your work with the specific tests
 4. **Commit** changes to your own branch
 5. **Push** your work back up to your fork
 6. Submit a **Pull request** so that we can review your changes

NOTE: Be sure to merge the latest from "upstream" before making a pull request!

Installation
-----------------------

## Android / Ios App
Have npm and bower in place
Install cordova ionic and karma-cli global 

npm install -g cordova ionic
npm install -g karma-cli

You can run the app part by switching into the myApp folder and start with

npm install

bower install

ionic serve


## Server / Backend
You can run the server part by switching into the myServer folder and start with 

mvn install

java -jar target/myserver-0.1.0.jar server config.yml


## Tests

The App aswell as the server part have tests on their own. Please follow their look and feel if you want to contribute. 

Copyright and Licensing
-----------------------

### License Summary
```
Copyright (c) 2017 by verwirrteswesen + mommel
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:
1. Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright
   notice, this list of conditions and the following disclaimer in the
   documentation and/or other materials provided with the distribution.
3. All advertising materials mentioning features or use of this software
   must display the following acknowledgement:
   This product includes software developed by the <organization>.
4. Neither the name of the <organization> nor the
   names of its contributors may be used to endorse or promote products
   derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY verwirrteswesen and mommel ''AS IS'' AND ANY
EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL verwirrteswesen and mommel BE LIABLE FOR ANY
DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
```

### FAQ

Where are tests to run?

They are still missing :)
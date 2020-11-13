# mss-training-sts4
Mark Stephen Sobkow's Training Projects for Spring Tool Suite 4 features needed for MssCFe

WARNING: This is NOT a training guide to show you how to use Spring 4.
Rather, it is my personal playground for learning how to work with
various Spring 4 technologies I'll need for my own
MSS Code Forge Environment project (MssCFe.)

You'll find the documentation for this project at
https://msobkow.github.io/mss-training-sts4/.

	Copyright 2020 Mark Stephen Sobkow
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	    http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.

The sub-projects herein are a series of incremental code stacks, each
building on the last to eventually form a complete code stack with all
of the features I'll need for the MssCFe project.

Although I believe in test-driven methodology as described by Josh Long,
this will not be a code base that follows this approach.  You can only
write tests for new code if you have some idea of how you're supposed
to write the new code; I don't.  Not yet.  But I will.

I have plenty of development experience with various frameworks and
technologies, including over 10 years of working on Enterprise-class
projects written in C, C++, and Java (JBoss/Hibernate era, which is
of course rusty being so long ago.)  Most of them were full n-tier
environments, with multiple services responsible for different aspects
of the overall system to be built.  The tools and technologies of the
layers of such architectures have changed; the general model and
architectural approach has not.

A client uses message-driven underpinnings to talk to middleware,
which handles business processing against the database back-end
and/or other coordinated services (supporting distributed transaction
management in many cases.)  The client could be a web interface
nowadays, a Java/JavaFX/FXML runtime, or implemented by a variety
of other technologies thanks to the standardization of REST/JSON
protocols by frameworks like Spring 4.

I would like others to be able to reuse and build on my learning
curve, so I'm making this project and the sub-projects under it
available under an Apache V2 license.  It is just prototyping and
test framework code, not a "real" application.

Next on my "todo" list is integrating JavaFX/FXML with Spring 4
following the training video on the subject presented by Josh
Long.

I hadn't planned on tackling it for my own needs until I'd addressed
all of the other layers of a distributed client-server application,
I'll do a simplified version of it now, and build on it later when
I have all the layers in place to map out the architecture I have
envisioned for MssCFe.

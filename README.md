# mss-training-sts4
Mark Stephen Sobkow's Training Projects for Spring Tool Suite 4 features needed for MssCFe

This family of sub-projects is a series of incremental code stacks, each
building on the last to eventually form a complete code stack with all of the
features I'll need for the MssCFe project and another one that I am working on
for a customer.  We have significant technology overlaps on the initial setups,
but then I will be diverging into Spring 4 support for client-server access to
a JPA/PostgreSQL service with a RESTful protocol between them.  Spring appears to
automate a lot of the heavy lifting for a client to access a server's repository
with that stack, so it is where I need to start.

Eventually I'll add on ReactJS support, again as implemented by Spring 4.  I want
my sample/test programs to demonstrate the setup and test architectures needed
for a full-stack Java 14 application with both Reactive Web and native JavaFX clients

As I would like others to be able to reuse and build on my learning curve, I'm making
this project and the subprojects available under an Apache V2 license.  Take it, modify it,
do whatever you want with it.  It is just setup and testing code, not a "real" project.

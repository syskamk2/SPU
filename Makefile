
COMPILER = fsc
SRCDIR = src
TARGETPE = SimplePE
OBJDIR = syskamk2
PACKAGE = SPU
PROG = Main
SCALA = scala
CFLAGS = -deprecation

all:
	$(COMPILER) $(CFLAGS) $(SRCDIR)/*.scala $(SRCDIR)/$(TARGETPE)/*.scala

run:
	$(SCALA) $(OBJDIR).$(PACKAGE).$(PROG)

clean:
	rm -r $(OBJDIR)/*

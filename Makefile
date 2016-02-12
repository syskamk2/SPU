
COMPILER = fsc
SRCDIR = src
OBJDIR = syskamk2
PACKAGE = SPU
PROG = Main
SCALA = scala
CFLAGS = -deprecation

all:
	$(COMPILER) $(CFLAGS) $(SRCDIR)/*.scala

run:
	$(SCALA) $(OBJDIR).$(PACKAGE).$(PROG)

clean:
	rm -r $(OBJDIR)/*

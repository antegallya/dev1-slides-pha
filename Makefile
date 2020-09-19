BUILD=build
LATEX=latexmk -recorder -pdf -pdflatex="pdflatex --shell-escape %O %S" -outdir=$(BUILD)
MAIN=dev1-dev-slides-pha

PRESENTATION=$(MAIN)-presentation.tex
HANDOUT=$(MAIN)-handout.tex
ALL=$(PRESENTATION) $(HANDOUT)
TARGETS=$(patsubst %.tex, %.pdf, $(MAIN))

.PHONY : clean preview all presentation handout

handout: $(patsubst %.tex, %.pdf, $(HANDOUT))
presentation: $(patsubst %.tex, %.pdf, $(PRESENTATION))

all: $(TARGETS)

$(BUILD):
	mkdir $(BUILD)

%.pdf: %.tex $(BUILD)
	$(LATEX) $<
	ln -fs $(BUILD)/$@

clean:
	rm -rf $(BUILD) _minted-*
	rm -f $(TARGETS)

preview: $(PRESENTATION) $(BUILD)
	$(LATEX) -pvc -interaction=nonstopmode $<

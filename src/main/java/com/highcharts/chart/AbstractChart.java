package com.highcharts.chart;

import com.google.gson.annotations.Expose;
import com.highcharts.Chart;
import com.highcharts.Legend;
import com.highcharts.TitleChart;
import com.highcharts.TooltipChart;
import com.highcharts.opt.Credits;
import com.highcharts.opt.PlotOptions;

public abstract class AbstractChart {
	
	public static final String PIE = "pie";
	public static final String AREA = "area";
	public static final String AREA_SPLINE = "areaspline";
	public static final String AREA_RANGE = "arearange";
	public static final String COLUMN = "column";
	public static final String LINE = "line";
	public static final String BAR = "bar";
	
	@Expose private Chart chart;
	@Expose private TitleChart title;
	@Expose private TitleChart subtitle;
	@Expose private TooltipChart tooltip;
	@Expose private PlotOptions plotOptions;
	@Expose private Credits credits;
	@Expose private Legend legend;
	
	public AbstractChart() {
		setChart(new Chart());
		setTitle(new TitleChart());
		setSubtitle(new TitleChart());
		setTooltip(new TooltipChart());
		setCredits(new Credits());
	}

	public void addTitle(String title) {
		getTitle().setText(title);
	}

	public void addSubtitle(String subTitle) {
		getSubtitle().setText(subTitle);
	}
	
	public Chart getChart() {
		return chart;
	}

	public void setChart(Chart chart) {
		this.chart = chart;
	}

	public TitleChart getTitle() {
		return title;
	}

	public void setTitle(TitleChart title) {
		this.title = title;
	}

	public TitleChart getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(TitleChart subtitle) {
		this.subtitle = subtitle;
	}

	public TooltipChart getTooltip() {
		return tooltip;
	}

	public void setTooltip(TooltipChart tooltip) {
		this.tooltip = tooltip;
	}

	public PlotOptions getPlotOptions() {
		return plotOptions;
	}

	public void setPlotOptions(PlotOptions plotOptions) {
		this.plotOptions = plotOptions;
	}

	public Credits getCredits() {
		return credits;
	}

	public void setCredits(Credits credits) {
		this.credits = credits;
	}

	public Legend getLegend() {
		return legend;
	}

	public void setLegend(Legend legend) {
		this.legend = legend;
	}
}
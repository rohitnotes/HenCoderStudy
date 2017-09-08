package com.meiji.hencoderstudy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Meiji on 2017/9/8.
 */

public class PageUtil {

    public static List<PageModel> getPageList(int type) {
        List<PageModel> pageModels = new ArrayList<>();
        switch (type) {
            case R.id.practice01:
                pageModels.add(new PageModel(R.layout.sample_color, R.string.title_draw_color, R.layout.practice_color));
                pageModels.add(new PageModel(R.layout.sample_circle, R.string.title_draw_circle, R.layout.practice_circle));
                pageModels.add(new PageModel(R.layout.sample_rect, R.string.title_draw_rect, R.layout.practice_rect));
                pageModels.add(new PageModel(R.layout.sample_point, R.string.title_draw_point, R.layout.practice_point));
                pageModels.add(new PageModel(R.layout.sample_oval, R.string.title_draw_oval, R.layout.practice_oval));
                pageModels.add(new PageModel(R.layout.sample_line, R.string.title_draw_line, R.layout.practice_line));
                pageModels.add(new PageModel(R.layout.sample_round_rect, R.string.title_draw_round_rect, R.layout.practice_round_rect));
                pageModels.add(new PageModel(R.layout.sample_arc, R.string.title_draw_arc, R.layout.practice_arc));
                pageModels.add(new PageModel(R.layout.sample_path, R.string.title_draw_path, R.layout.practice_path));
                pageModels.add(new PageModel(R.layout.sample_histogram, R.string.title_draw_histogram, R.layout.practice_histogram));
                pageModels.add(new PageModel(R.layout.sample_pie_chart, R.string.title_draw_pie_chart, R.layout.practice_pie_chart));
                break;

            case R.id.practice02:
                pageModels.add(new PageModel(R.string.title_linear_gradient, R.layout.practice_linear_gradient));
                pageModels.add(new PageModel(R.string.title_radial_gradient, R.layout.practice_radial_gradient));
                pageModels.add(new PageModel(R.string.title_sweep_gradient, R.layout.practice_sweep_gradient));
                pageModels.add(new PageModel(R.string.title_bitmap_shader, R.layout.practice_bitmap_shader));
                pageModels.add(new PageModel(R.string.title_compose_shader, R.layout.practice_compose_shader));
                pageModels.add(new PageModel(R.string.title_lighting_color_filter, R.layout.practice_lighting_color_filter));
                pageModels.add(new PageModel(R.string.title_color_matrix_color_filter, R.layout.practice_color_matrix_color_filter));
                pageModels.add(new PageModel(R.string.title_xfermode, R.layout.practice_xfermode));
                pageModels.add(new PageModel(R.string.title_stroke_cap, R.layout.practice_stroke_cap));
                pageModels.add(new PageModel(R.string.title_stroke_join, R.layout.practice_stroke_join));
                pageModels.add(new PageModel(R.string.title_stroke_miter, R.layout.practice_stroke_miter));
                pageModels.add(new PageModel(R.string.title_path_effect, R.layout.practice_path_effect));
                pageModels.add(new PageModel(R.string.title_shader_layer, R.layout.practice_shadow_layer));
                pageModels.add(new PageModel(R.string.title_mask_filter, R.layout.practice_mask_filter));
                pageModels.add(new PageModel(R.string.title_fill_path, R.layout.practice_fill_path));
                pageModels.add(new PageModel(R.string.title_text_path, R.layout.practice_text_path));
                break;
//            case R.id.practice02:
//                pageModels.add(new PageModel(R.layout.sample_linear_gradient, R.string.title_linear_gradient, R.layout.practice_linear_gradient));
//                pageModels.add(new PageModel(R.layout.sample_radial_gradient, R.string.title_radial_gradient, R.layout.practice_radial_gradient));
//                pageModels.add(new PageModel(R.layout.sample_sweep_gradient, R.string.title_sweep_gradient, R.layout.practice_sweep_gradient));
//                pageModels.add(new PageModel(R.layout.sample_bitmap_shader, R.string.title_bitmap_shader, R.layout.practice_bitmap_shader));
//                pageModels.add(new PageModel(R.layout.sample_compose_shader, R.string.title_compose_shader, R.layout.practice_compose_shader));
//                pageModels.add(new PageModel(R.layout.sample_lighting_color_filter, R.string.title_lighting_color_filter, R.layout.practice_lighting_color_filter));
//                pageModels.add(new PageModel(R.layout.sample_color_mask_color_filter, R.string.title_color_matrix_color_filter, R.layout.practice_color_matrix_color_filter));
//                pageModels.add(new PageModel(R.layout.sample_xfermode, R.string.title_xfermode, R.layout.practice_xfermode));
//                pageModels.add(new PageModel(R.layout.sample_stroke_cap, R.string.title_stroke_cap, R.layout.practice_stroke_cap));
//                pageModels.add(new PageModel(R.layout.sample_stroke_join, R.string.title_stroke_join, R.layout.practice_stroke_join));
//                pageModels.add(new PageModel(R.layout.sample_stroke_miter, R.string.title_stroke_miter, R.layout.practice_stroke_miter));
//                pageModels.add(new PageModel(R.layout.sample_path_effect, R.string.title_path_effect, R.layout.practice_path_effect));
//                pageModels.add(new PageModel(R.layout.sample_shadow_layer, R.string.title_shader_layer, R.layout.practice_shadow_layer));
//                pageModels.add(new PageModel(R.layout.sample_mask_filter, R.string.title_mask_filter, R.layout.practice_mask_filter));
//                pageModels.add(new PageModel(R.layout.sample_fill_path, R.string.title_fill_path, R.layout.practice_fill_path));
//                pageModels.add(new PageModel(R.layout.sample_text_path, R.string.title_text_path, R.layout.practice_text_path));
//                break;
        }
        return pageModels;
    }
}